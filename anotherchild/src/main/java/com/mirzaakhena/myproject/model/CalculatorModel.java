package com.mirzaakhena.myproject.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorModel {

	private int a;

	private int b;

	public int getSumAB() {
		return a + b;
	}

}
