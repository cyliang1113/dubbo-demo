package com.leo.demo.dubbo;

import com.leo.demo.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leo.demo.dubbo.service.HelloService;

public class Demo01 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		HelloService demoService = (HelloService) context.getBean("helloService");
		String hello = demoService.hello("world");
		System.out.println(hello);

		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService.getUsername());
	}
}
