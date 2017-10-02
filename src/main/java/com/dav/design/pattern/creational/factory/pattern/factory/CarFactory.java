package com.dav.design.pattern.creational.factory.pattern.factory;

import com.dav.design.pattern.creational.factory.pattern.concreteCreator.Car;
import com.dav.design.pattern.creational.factory.pattern.product.Honda;
import com.dav.design.pattern.creational.factory.pattern.product.Nexus;
import com.dav.design.pattern.creational.factory.pattern.product.Toyota;

public class CarFactory {
	public void viewCar(String carType) {
		Car car;
		if (carType.equalsIgnoreCase("HONDA")) {
			car = new Honda();
			car.view();
		} else if (carType.equalsIgnoreCase("NEXUS")) {
			car = new Nexus();
			car.view();
		} else if (carType.equalsIgnoreCase("TOYOTA")) {
			car = new Toyota();
			car.view();
		}
	}
}
