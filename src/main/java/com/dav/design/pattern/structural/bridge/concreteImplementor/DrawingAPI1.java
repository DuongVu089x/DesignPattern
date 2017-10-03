package com.dav.design.pattern.structural.bridge.concreteImplementor;

import com.dav.design.pattern.structural.bridge.implementor.DrawingAPI;

public class DrawingAPI1 implements DrawingAPI {

	@Override
	public void drawCircle(double x, double y, double radius) {
		System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
	}

}
