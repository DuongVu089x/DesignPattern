package com.dav.design.pattern.structural.composite.composite;

import java.util.ArrayList;
import java.util.Arrays;

import com.dav.design.pattern.structural.composite.component.Component;

public class Composite extends Component {

	private ArrayList<Component> list = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		list.add(component);
	}

	@Override
	public void remove(Component component) {
		list.remove(component);
	}

	@Override
	public void display(int depth) {
		char[] charArray = new char[depth];
		Arrays.fill(charArray, '-');
		System.out.println(new String(charArray) + super.name);
		for (Component c : list) {
			c.display(depth + 2);
		}
	}

}
