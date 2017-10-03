package com.dav.design.pattern.creational.prototype;

import com.dav.design.pattern.creational.prototype.impl.PrototypeImpl;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeImpl prototype = new PrototypeImpl(1000);

		for (int i = 0; i < 10; i++) {
			// Create a defensive copy of the object to allow safe mutation
			Prototype tempotype = prototype.clone();

			// Derive a new value from the prototype's "x" value
			tempotype.setX(tempotype.getX() * i);
			tempotype.printX();
			tempotype.printCode();
		}
	}

}
