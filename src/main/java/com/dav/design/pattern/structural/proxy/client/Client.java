package com.dav.design.pattern.structural.proxy.client;

import com.dav.design.pattern.structural.proxy.proxy.Proxy;
import com.dav.design.pattern.structural.proxy.service.impl.Math;

public class Client {

	static Proxy mathProxy = new Proxy(new Math());

	public static void main(String[] args) {
		System.out.println("ADD "+ mathProxy.add(2, 3));
		System.out.println("SUB "+ mathProxy.sub(2, 3));
		System.out.println("DIV "+ mathProxy.div(2, 3));
		System.out.println("MUL "+ mathProxy.mul(2, 3));
	}

}
