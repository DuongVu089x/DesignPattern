package com.dav.design.pattern.structural.adapter.adapter;

import com.dav.design.pattern.structural.adapter.adaptee.Adaptee;
import com.dav.design.pattern.structural.adapter.target.Target;

public class Adapter extends Adaptee implements Target{

	@Override
	public String estimate(int i) {
		return String.valueOf(Math.round(precise(i, 3)));
	}

	
}
