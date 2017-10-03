package com.dav.design.pattern.structural.decorator.concreteDecorator;

import com.dav.design.pattern.structural.decorator.component.IPizza;
import com.dav.design.pattern.structural.decorator.decorator.PizzaDecorator;

public class PepperDecorator extends PizzaDecorator {

	public PepperDecorator(IPizza pizza) {
		super(pizza);
	}

	@Override
	public String doPizza() {
		String type = mPizza.doPizza();
		return type + addPepper();
	}

	private String addPepper() {
		return " + Pepper";
	}
}
