package com.dav.design.pattern.creational.singleton.client;

import com.dav.design.pattern.creational.singleton.Singleton;

public class Client {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton singleton = Singleton.getInstance();
				singleton.print();
				System.out.println(singleton.hashCode());
			}
		});
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				Singleton singleton = Singleton.getInstance();
				singleton.print();
				System.out.println(singleton.hashCode());
			}
		});
		thread2.start();
	}
}