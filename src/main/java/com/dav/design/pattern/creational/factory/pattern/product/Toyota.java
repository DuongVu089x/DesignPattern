package com.dav.design.pattern.creational.factory.pattern.product;

import com.dav.design.pattern.creational.factory.pattern.concreteCreator.Car;

public class Toyota implements Car{

	@Override
	public void view() {
		 System.out.println("Toyota view");		
	}

}
