package com.dav.design.pattern.creational.factory.pattern.product;

import com.dav.design.pattern.creational.factory.pattern.concreteCreator.Car;

public class Honda implements Car{

	@Override
	public void view() {
		System.out.println("Honda view");		
	}

}
