package com.dav.design.pattern.creational.abstractFactory.client;

import com.dav.design.pattern.creational.abstractFactory.abstractFactory.GUIFactory;
import com.dav.design.pattern.creational.abstractFactory.abstractProduct.Display;
import com.dav.design.pattern.creational.abstractFactory.concreteFactory.MacOSFactory;
import com.dav.design.pattern.creational.abstractFactory.concreteFactory.WindowsOSFactory;

public class Client {
	public static void main(String[] args) {
		GUIFactory factory = null;
		Display display = null;

		factory = new WindowsOSFactory();
		display = factory.createGUI();
		display.draw();

		factory = new MacOSFactory();
		display = factory.createGUI();
		display.draw();
	}
}
