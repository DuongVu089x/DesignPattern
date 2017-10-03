package com.dav.design.pattern.structural.flyweight;

public abstract class Character {
	
	protected char symbol;
	protected int width;
	protected int height;
	protected int ascent;
	protected int descent;
	protected int pointsize;

	public abstract void draw(int p);
}
