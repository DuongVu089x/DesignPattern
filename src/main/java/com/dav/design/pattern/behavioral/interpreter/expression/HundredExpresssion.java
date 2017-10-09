package com.dav.design.pattern.behavioral.interpreter.expression;

public class HundredExpresssion extends Expression {

	@Override
	public String one() {
		return "C";
	}

	@Override
	public String four() {
		return "CD";
	}

	@Override
	public String five() {
		return "D";
	}

	@Override
	public String nine() {
		return "CM";
	}

	@Override
	public int multiplier() {
		return 100;
	}

}
