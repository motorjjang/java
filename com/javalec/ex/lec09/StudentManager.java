package com.javalec.ex.lec09;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("È«±æµ¿", 22, 20123487, "¿¬±Ø¿µÈ­°ú");
		studentManager.addStudent("È«±æ¼ø", 24, 20106428, "¼öÇĞ°ú");
		studentManager.addStudent("ÀÌÀº°æ", 21, 20135788, "±¹¹®°ú");
		studentManager.addStudent("±èÃ¶¼ö", 23, 20114221, "Ã¼À°°ú");
		studentManager.addStudent("±è¼øÈñ", 26, 20089883, "¹«¿ë°ú");
		
		for (int i = 0; i < studentManager.students.size() ; i++) {
			System.out.println(studentManager.students.get(i).getName());
		}
		
		studentManager.studentExpel.addExpelStudent("ÀÓ²©Á¤", 33, 20131234, "µî»ê");
		studentManager.studentExpel.addExpelStudent("ÀÓ²©¼ø", 24, 20144332, "¿ä¸®");
		
		for (int i = 0; i < studentManager.studentExpel.expelStudents.size(); i++) {
			System.out.println(studentManager.studentExpel.expelStudents.get(i).getName());	
		}
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " ÇĞ»ıÁ¤º¸ ÀÔ·Â¼º°ø!!!");
	}
}
