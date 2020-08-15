package com.javalec.ex.lec09;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent("홍길동", 22, 20123487, "연극영화과");
		studentManager.addStudent("홍길수", 24, 20106428, "수학과");
		studentManager.addStudent("이은경", 21, 20135788, "국문과");
		studentManager.addStudent("김철수", 23, 20114211, "체육과");
		studentManager.addStudent("김순희", 26, 20089883, "무용과");
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		Student st = new Student(name, age, studentNum, major);
		students.add(st);
		System.out.println(name + " 학생정보 입력성공!");
	}
}
