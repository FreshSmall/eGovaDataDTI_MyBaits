package cn.com.egova.java;

import org.apache.http.HeaderElement;
import org.apache.http.HeaderElementIterator;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class HttpClientDemo {

	private static String url = "http://localhost:8081/SpringMVCDemoC_war_exploded/";

	/**
	 * 测试Http无连接池
	 */
	public void testHttpNotSource(){
		long start = System.currentTimeMillis();
		final CloseableHttpClient httpClient = HttpClients.createDefault();
		ThreadPoolExecutor tp  = new ThreadPoolExecutor(1,1,60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(2000000));
		final int[] count = {0};
		final Random random = new Random();
		for (int i = 0;i<2000;i++){
			tp.execute(new Runnable() {
				@Override
				public void run() {
					HttpGet httpGet = new HttpGet(url);
					try {
						CloseableHttpResponse response = httpClient.execute(httpGet);
						EntityUtils.toString(response.getEntity());
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		}
		tp.shutdown();
		try {
			tp.awaitTermination(1,TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("采用无Http连接池测试花费时间："+(end-start));
	}

	/**
	 * 测试Http连接池
	 */
	public void testHttpSource(){
		long start = System.currentTimeMillis();


		ConnectionKeepAliveStrategy myStrategy = new ConnectionKeepAliveStrategy() {
			@Override
			public long getKeepAliveDuration(HttpResponse response, HttpContext context) {
				HeaderElementIterator it = new BasicHeaderElementIterator
						(response.headerIterator(HTTP.CONN_KEEP_ALIVE));
				while (it.hasNext()) {
					HeaderElement he = it.nextElement();
					String param = he.getName();
					String value = he.getValue();
					if (value != null && param.equalsIgnoreCase
							("timeout")) {
						return Long.parseLong(value) * 1000;
					}
				}
				return 60 * 1000;//如果没有约定，则默认定义时长为60s
			}
		};

		PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager();
		connectionManager.setMaxTotal(50);
		connectionManager.setDefaultMaxPerRoute(50);

		final CloseableHttpClient httpClient = HttpClients.custom()
				.setConnectionManager(connectionManager)
				.setKeepAliveStrategy(myStrategy)
				.setDefaultRequestConfig(RequestConfig.custom().build())
				.build();

		ThreadPoolExecutor tp  = new ThreadPoolExecutor(10,10,60, TimeUnit.SECONDS,new LinkedBlockingQueue<Runnable>(2000000));
		final Random random = new Random();
		final int[] count = {0};
		for (int i = 0;i<2000;i++){
			tp.execute(new Runnable() {
				@Override
				public void run() {
					HttpGet httpGet = new HttpGet(url);
					try {
						CloseableHttpResponse response = httpClient.execute(httpGet);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			});
		}
		tp.shutdown();
		try {
			tp.awaitTermination(1,TimeUnit.HOURS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("采用有Http连接池测试花费时间："+(end-start));
	}

	public static void main(String[] args) {
		HttpClientDemo demo = new HttpClientDemo();
		demo.testHttpSource();
//		demo.testHttpNotSource();
	}
}
