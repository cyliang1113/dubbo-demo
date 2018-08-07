package com.leo.demo.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.leo.demo.dubbo.service.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String msg) {
		int i = 1/0;
		return "hello, " + msg;
	}

}
