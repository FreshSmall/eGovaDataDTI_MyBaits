package cn.com.egova.java;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	static class ThreadDemo implements Runnable{

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				if (i==5) {
					int a = 1/0;
				}
				System.out.println("定时调用线程"+i);
			}
		}
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		for (int i=0;i<5;i++){
			executorService.execute(new ThreadDemo());
		}
		executorService.shutdown();
	}
}
