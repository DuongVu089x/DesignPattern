package com.dav.design.pattern.structural.flyweight;

public class CharacterA extends Character {

	public CharacterA() {
		this.symbol = 'A';
		this.height = 1;
		this.width = 1;
		this.ascent = 1;
		this.descent = 1;
	}

	@Override
	public void draw(int p) {
		this.pointsize = p;
		System.out.println(this.symbol);
	}

}
