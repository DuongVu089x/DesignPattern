package com.dav.design.pattern.structural.proxy.proxy;

import com.dav.design.pattern.structural.proxy.service.IMath;

public class Proxy implements IMath {

	private com.dav.design.pattern.structural.proxy.service.impl.Math math;

	public Proxy(com.dav.design.pattern.structural.proxy.service.impl.Math math) {
		this.math = math;
	}

	@Override
	public double add(double x, double y) {
		return this.math.add(x, y);
	}

	@Override
	public double sub(double x, double y) {
		return this.math.sub(x, y);
	}

	@Override
	public double mul(double x, double y) {
		return this.math.mul(x, y);
	}

	@Override
	public double div(double x, double y) {
		return this.math.div(x, y);
	}

}
