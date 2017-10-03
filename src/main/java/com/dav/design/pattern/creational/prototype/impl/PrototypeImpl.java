package com.dav.design.pattern.creational.prototype.impl;

import com.dav.design.pattern.creational.prototype.Prototype;

public class PrototypeImpl implements Prototype, Cloneable {

	private int x;

	public PrototypeImpl(int x) {
		setX(x);
	}

	@Override
	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void printX() {
		System.out.println("Value: " + x);
	}

	@Override
	public PrototypeImpl clone() throws CloneNotSupportedException {
		return (PrototypeImpl) super.clone();
	}

	@Override
	public void printCode() {
		System.out.println(this.hashCode());
	}
}
