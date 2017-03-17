package com.adityaadvani.testapp.test.resources;

public class Temp {
	private double f;
	private double c;
	private String message;

	public Temp() {

	}

	public Temp(double f, double c, String msg) {
		this.f = f;
		this.c = c;
		this.message = msg;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getF() {
		return f;
	}

	public void setF(double f) {
		this.f = f;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
}
