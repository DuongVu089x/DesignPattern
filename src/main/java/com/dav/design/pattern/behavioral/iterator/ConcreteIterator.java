package com.dav.design.pattern.behavioral.iterator;

public class ConcreteIterator extends Iterator {

	private ConcreteAggregate aggregate;
	private int current = 0;

	public ConcreteIterator(ConcreteAggregate aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public Object first() {
		return this.aggregate.getItems().get(0);
	}

	@Override
	public Object next() {
		Object ret = null;
		if (current < aggregate.getItems().size() - 1) {
			ret = aggregate.getItems().get(++current);
		}

		return ret;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.getItems().size();
	}

	@Override
	public Object currentItem() {
		return this.aggregate.getItems().get(current);
	}

}
