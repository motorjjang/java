package com.javalec.ex.lec09;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent("홍길동", 22, 20123487, "연극영화과");
		studentManager.addStudent("홍길수", 24, 20106428, "수학과");
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " 학생정보 입력성공!");
	}
}
