package com.dav.design.pattern.structural.bridge.client;

import com.dav.design.pattern.structural.bridge.abstraction.Shape;
import com.dav.design.pattern.structural.bridge.concreteImplementor.DrawingAPI1;
import com.dav.design.pattern.structural.bridge.concreteImplementor.DrawingAPI2;
import com.dav.design.pattern.structural.bridge.refinedAbstraction.CircleShape;

public class BridgePattern {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new CircleShape(1, 2, 3, new DrawingAPI1());
		shapes[1] = new CircleShape(5, 7, 11, new DrawingAPI2());

		for (Shape shape : shapes) {
			shape.resizeByPercentage(2.5);
			shape.draw();
		}
	}
}
