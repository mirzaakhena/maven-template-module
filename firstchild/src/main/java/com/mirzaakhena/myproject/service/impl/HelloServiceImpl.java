package com.mirzaakhena.myproject.service.impl;

import org.springframework.stereotype.Service;

import com.mirzaakhena.myproject.model.HelloModel;
import com.mirzaakhena.myproject.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public HelloModel helloworld(String name) {
		HelloModel model = new HelloModel();
		model.setMessage("hello " + name);
		return model;
	}

}
