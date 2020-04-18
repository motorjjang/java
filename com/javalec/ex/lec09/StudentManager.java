package com.javalec.ex.lec09;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		
		studentManager.addStudent("ȫ�浿", 22, 20123487, "���ؿ�ȭ��");
		studentManager.addStudent("ȫ���", 24, 20106428, "���а�");
		studentManager.addStudent("������", 21, 20135788, "������");
		studentManager.addStudent("��ö��", 23, 20114221, "ü����");
		studentManager.addStudent("�����", 26, 20089883, "�����");
		
		for (int i = 0; i < studentManager.students.size() ; i++) {
			System.out.println(studentManager.students.get(i).getName());
		}
		
		studentManager.studentExpel.addExpelStudent("�Ӳ���", 33, 20131234, "���");
		studentManager.studentExpel.addExpelStudent("�Ӳ���", 24, 20144332, "�丮");
		
		for (int i = 0; i < studentManager.studentExpel.expelStudents.size(); i++) {
			System.out.println(studentManager.studentExpel.expelStudents.get(i).getName());	
		}
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		students.add(new Student(name, age, studentNum, major));
		System.out.println(name + " �л����� �Է¼���!!!");
	}
}
