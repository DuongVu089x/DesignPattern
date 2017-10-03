package com.dav.design.pattern.structural.adapter.client;

import com.dav.design.pattern.structural.adapter.adapter.Adapter;
import com.dav.design.pattern.structural.adapter.target.Target;

public class ClientMain {
	public static void main(String[] args) {
		System.out.println("--- Adapter Pattern ---");
		Target target = new Adapter();
		System.out.println(target.estimate(5));
	}
}
	