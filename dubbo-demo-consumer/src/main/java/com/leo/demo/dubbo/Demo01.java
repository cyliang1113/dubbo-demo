package com.leo.demo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leo.demo.dubbo.service.HelloService;

public class Demo01 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		HelloService demoService = (HelloService) context.getBean("helloService"); // 获取远程服务代理
		String hello = demoService.hello("world"); // 执行远程方法
		System.out.println(hello); // 显示调用结果
		System.out.println("");
	}
}
