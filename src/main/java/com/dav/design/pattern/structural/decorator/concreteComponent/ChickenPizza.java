package com.dav.design.pattern.structural.decorator.concreteComponent;

import com.dav.design.pattern.structural.decorator.component.IPizza;

public class ChickenPizza implements IPizza {

	@Override
	public String doPizza() {
		return "I am a Chicken Pizza";
	}

}
