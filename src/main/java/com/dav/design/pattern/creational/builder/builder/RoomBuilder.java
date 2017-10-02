package com.dav.design.pattern.creational.builder.builder;

import com.dav.design.pattern.creational.builder.product.Room;

public abstract class RoomBuilder<T extends RoomBuilder<T, R>, R extends Room> {

	// Our product
	protected R room;

	public T paint() {
		// Method here paints your room.
		return selft();
	}

	// Get instance of Builder
	public abstract T selft();

	// Return product
	public R build() {
		return room;
	}
}
