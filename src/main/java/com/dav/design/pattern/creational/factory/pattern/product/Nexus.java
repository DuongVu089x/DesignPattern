package com.dav.design.pattern.creational.factory.pattern.product;

import com.dav.design.pattern.creational.factory.pattern.concreteCreator.Car;

public class Nexus implements Car{

	@Override
	public void view() {
		System.out.println("Nexus view");		
	}

}
