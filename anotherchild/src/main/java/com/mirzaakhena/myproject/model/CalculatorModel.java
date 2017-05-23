package com.mirzaakhena.myproject.model;

public class CalculatorModel {

	private int a;

	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public int getSumAB() {
		return a + b;
	}

}
