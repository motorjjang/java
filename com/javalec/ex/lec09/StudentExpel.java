package com.javalec.ex.lec09;

import java.util.ArrayList;

public class StudentExpel {

	ArrayList<Student> expelStudents;
	
	public StudentExpel() {
		// TODO Auto-generated constructor stub
		expelStudents = new ArrayList<Student>();
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		
		Student s = new Student(name, age, studentNum, major);
		expelStudents.add(s);
	}
}
