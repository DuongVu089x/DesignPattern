package com.dav.design.pattern.structural.composite.client;

import com.dav.design.pattern.structural.composite.composite.Composite;
import com.dav.design.pattern.structural.composite.leaf.Leaf;

public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));

		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		Composite comy = new Composite("Composite Y");
		comy.add(new Leaf("Leaf YA"));
		comp.add(comy);
		
		root.add(comp);
		root.add(new Leaf("Leaf C"));

		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		root.remove(leaf);
		root.display(1);
	}
}
