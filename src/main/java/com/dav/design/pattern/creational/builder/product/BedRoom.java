package com.dav.design.pattern.creational.builder.product;

public class BedRoom implements Room {
	
	private boolean hasBed;

	public BedRoom() {
	}

	public boolean isHasBed() {
		return hasBed;
	}

	public void setHasBed(boolean hasBed) {
		this.hasBed = hasBed;
	}
}
