package com.dav.design.pattern.behavioral.iterator;

import java.util.ArrayList;

public class ConcreteAggregate extends Aggregate {

	private ArrayList<Object> items = new ArrayList<Object>();

	private int count;

	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public ArrayList<Object> getItems() {
		return items;
	}

	public void setItems(ArrayList<Object> items) {
		this.items = items;
	}

	public int getCount() {
		return count;
	}

}
