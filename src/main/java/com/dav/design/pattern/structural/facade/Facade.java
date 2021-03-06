package com.dav.design.pattern.structural.facade;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class Facade {
	private static HashMap<String, Team> teams = new HashMap<String, Team>();

	public static void buildCampus() {
		Campus.setCourse(1000, "Operating System");
		Campus.setCourse(2000, "Core Java");
		Campus.setStudent(100, "Bill Gates");
		Campus.setStudent(101, "James Gosling");
		Campus.setStudent(102, "Linus Tovarld");
	}

	public static void buildTeam(String tName, int courseCode) {
		Team aTeam = new Team(tName);
		aTeam.setCourse(Campus.getCourse(courseCode));
		teams.put(tName, aTeam);
	}

	public void enroll(int studentCode, String tName) {
		Student regStudent = Campus.getStudent(studentCode);
		Team aTeam = (Team) teams.get(tName);
		aTeam.addStudent(regStudent);
	}

	public Collection<String> display(String tName) {
		Vector<String> result = new Vector<String>();
		Team aTeam = (Team) teams.get(tName);

		result.addElement(aTeam.getName());
		result.addElement(aTeam.getCourse().getName());
		LinkedList<?> students = aTeam.getStudents();
		for (int i = 0; i < students.size(); ++i) {
			result.addElement(((Student) students.get(i)).getName());
		}
		return result;
	}
	
}
