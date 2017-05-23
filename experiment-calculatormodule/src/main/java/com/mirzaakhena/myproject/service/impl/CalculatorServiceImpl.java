package com.mirzaakhena.myproject.service.impl;

import org.springframework.stereotype.Service;

import com.mirzaakhena.myproject.model.CalculatorModel;
import com.mirzaakhena.myproject.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public CalculatorModel sum(int a, int b) {
		CalculatorModel model = new CalculatorModel();
		model.setA(a);
		model.setB(b);
		return model;
	}

}
