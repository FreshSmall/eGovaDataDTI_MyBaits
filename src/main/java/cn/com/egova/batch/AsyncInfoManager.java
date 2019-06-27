package cn.com.egova.batch;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class AsyncInfoManager {

	@Async
	public String syncInfo(){
		String str = "调用方法的线程："+Thread.currentThread().getName();
		System.out.println(str);
		return str;
	}
}
