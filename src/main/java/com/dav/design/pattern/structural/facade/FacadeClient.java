package com.dav.design.pattern.structural.facade;

import java.util.Collection;
import java.util.Iterator;

public class FacadeClient {
	public static void main(String[] args) {
		Facade facade = new Facade();

		Facade.buildCampus();
		Facade.buildTeam("OS1000", 1000);
		Facade.buildTeam("CJ2000", 2000);

		facade.enroll(100, "OS1000");
		facade.enroll(101, "CJ2000");
		facade.enroll(102, "OS1000");

		Collection<?> c = facade.display("OS1000");
		Iterator<?> iter = c.iterator();
		System.out.println("Team Name: " + (String) iter.next());
		System.out.println("Course Name: " + (String) iter.next());
		System.out.println("Students List: ");
		while (iter.hasNext()) {
			System.out.println("  + " + (String) iter.next());
		}
	}
}
