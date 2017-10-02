package com.dav.design.pattern.creational.abstractFactory.product;

import com.dav.design.pattern.creational.abstractFactory.abstractProduct.Display;

public class WindowsOSDisplay extends Display {

	@Override
	public void draw() {
		System.out.println("WindowsOSDisplay is created!");
	}

}
