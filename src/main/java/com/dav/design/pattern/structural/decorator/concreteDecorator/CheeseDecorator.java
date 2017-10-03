package com.dav.design.pattern.structural.decorator.concreteDecorator;

import com.dav.design.pattern.structural.decorator.component.IPizza;
import com.dav.design.pattern.structural.decorator.decorator.PizzaDecorator;

public class CheeseDecorator extends PizzaDecorator {

	public CheeseDecorator(IPizza pizza) {
		super(pizza);
	}

	@Override
	public String doPizza() {
		String type = mPizza.doPizza();
		return type + addCheese();
	}

	private String addCheese() {
		return " + Cheese";
	}
}
