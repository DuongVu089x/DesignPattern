package com.dav.design.pattern.behavioral.iterator;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		ArrayList<Object> demo = new ArrayList<>();

		demo.add("Item A");
		demo.add("Item B");
		demo.add("Item C");
		demo.add("Item D");

		a.setItems(demo);
		
		ConcreteIterator i = new ConcreteIterator(a);

		System.out.println("Iterating over collection");

		Object item = i.first();
		while (item != null) {
			System.out.println(item);
			item = i.next();
		}
	}
}
