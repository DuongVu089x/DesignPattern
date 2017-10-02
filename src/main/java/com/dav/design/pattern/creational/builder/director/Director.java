package com.dav.design.pattern.creational.builder.director;

import com.dav.design.pattern.creational.builder.concreateBuilder.BedRoomBuilder;
import com.dav.design.pattern.creational.builder.product.BedRoom;
import com.dav.design.pattern.creational.builder.product.Room;

public class Director {
	public static void main(String[] args) {
		BedRoomBuilder builder = new BedRoomBuilder();
		Room room = builder.paint().addBed().build();
		System.out.println(((BedRoom) room).isHasBed());
	}
}
