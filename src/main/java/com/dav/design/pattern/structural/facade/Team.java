package com.dav.design.pattern.structural.facade;

import java.util.LinkedList;

public class Team {
	private String name;
	private LinkedList<Student> students = new LinkedList<Student>();
	private Course course;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCourse(Course c) {
		course = c;
	}

	public Course getCourse() {
		return course;
	}

	public void addStudent(Student s) {
		students.add(s);
	}

	public LinkedList<Student> getStudents() {
		return students;
	}
}
