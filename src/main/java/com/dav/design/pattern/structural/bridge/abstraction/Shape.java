package com.dav.design.pattern.structural.bridge.abstraction;

public interface Shape {
	public void draw(); // Low-level

	public void resizeByPercentage(double pct); // High-level
}