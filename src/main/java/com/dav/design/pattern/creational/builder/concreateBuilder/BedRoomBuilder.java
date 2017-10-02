package com.dav.design.pattern.creational.builder.concreateBuilder;

import com.dav.design.pattern.creational.builder.builder.RoomBuilder;
import com.dav.design.pattern.creational.builder.product.BedRoom;

public class BedRoomBuilder extends RoomBuilder<BedRoomBuilder, BedRoom> {


	public BedRoomBuilder() {
		room = new BedRoom();
	}

	public BedRoomBuilder addBed() {
		room.setHasBed(true);
		return selft();
	}

	@Override
	public BedRoomBuilder selft() {
		return this;
	}

}
