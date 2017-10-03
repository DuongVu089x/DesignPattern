package com.dav.design.pattern.structural.adapter.adaptee;

public class Adaptee {
	
	int a;
	
	public double precise(double a, double b) {
		System.out.println("Old lib::precise");
		return a / b;
	}
	
	int something(){
		System.out.println(123);
		return 0;
	}
}
