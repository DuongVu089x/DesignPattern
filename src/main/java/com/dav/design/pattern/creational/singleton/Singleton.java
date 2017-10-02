package com.dav.design.pattern.creational.singleton;

public class Singleton {
	private static final Singleton instance = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return instance;
	}

	// Do something
	public void print() {
		System.out.println("Print(): Singleton does something!");
	}
}
