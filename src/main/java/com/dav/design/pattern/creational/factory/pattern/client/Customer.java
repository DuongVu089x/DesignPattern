package com.dav.design.pattern.creational.factory.pattern.client;

import com.dav.design.pattern.creational.factory.pattern.factory.CarFactory;

public class Customer {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		carFactory.viewCar("HONDA");
		carFactory.viewCar("NEXUS");
		carFactory.viewCar("TOYOTA");
	}
}
