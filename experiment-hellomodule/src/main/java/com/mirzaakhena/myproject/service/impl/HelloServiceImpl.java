package com.mirzaakhena.myproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirzaakhena.myproject.model.HelloModel;
import com.mirzaakhena.myproject.service.CalculatorService;
import com.mirzaakhena.myproject.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private CalculatorService calculatorService;

	@Override
	public HelloModel helloworld(String name) {

		// try to use another service from another bundle
		int x = calculatorService.sum(2, 3).getSumAB();

		HelloModel model = new HelloModel();
		model.setMessage("hello " + name + ". Sum of 2 + 3 = " + x);
		return model;
	}

}
