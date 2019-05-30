package cn.com.egova.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class RecAop {

	@Before("execution(* cn.com.egova.service.impl.StatInfoServiceImpl.*(..))")
	public void testTransaction(){
		System.out.println("开始插入数据，请准备");
	}
}
