package com.dav.design.pattern.creational.abstractFactory.concreteFactory;

import com.dav.design.pattern.creational.abstractFactory.abstractFactory.GUIFactory;
import com.dav.design.pattern.creational.abstractFactory.abstractProduct.Display;
import com.dav.design.pattern.creational.abstractFactory.product.WindowsOSDisplay;

public class WindowsOSFactory extends GUIFactory{

	@Override
	public Display createGUI() {
		return new WindowsOSDisplay();
	}

}
