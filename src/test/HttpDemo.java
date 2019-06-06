import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

public class HttpDemo {

	public static void main(String[] args) {

		//连接管理器，使用无惨构造
		PoolingHttpClientConnectionManager connManager
				= new PoolingHttpClientConnectionManager();

		//最大连接数
		connManager.setMaxTotal(200);
		//默认的每个路由的最大连接数
		connManager.setDefaultMaxPerRoute(100);
		/*//设置到某个路由的最大连接数，会覆盖defaultMaxPerRoute
		connManager.setMaxPerRoute(new HttpRoute(new HttpHost("somehost", 80)), 150);

		CloseableHttpClient httpclient = HttpClients.custom()
				.setConnectionManager(connManager)             //连接管理器
				.setDefaultRequestConfig(defaultRequestConfig) //默认请求配置
				.setRetryHandler(myRetryHandler)               //重试策略
				.build();*/
	}

}
