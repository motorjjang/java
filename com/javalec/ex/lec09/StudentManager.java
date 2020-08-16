package com.javalec.ex.lec09;

import java.util.ArrayList;

public class StudentManager {

	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {
		
		StudentManager manager = new StudentManager();
		manager.addStudent("홍길동", 22, 20123487, "연극영화과");
		manager.addStudent("홍길수", 24, 20106428, "수학과");
		manager.addStudent("이은경", 21, 20135788, "국문과");
		manager.addStudent("김철수", 23, 20114211, "체육과");
		manager.addStudent("김순희", 26, 20114211, "무용과");
		
//		int m = 20114211;
//		for (int i=0; i<manager.students.size(); i++) {
//			if (manager.students.get(i).getStudentNum() == m) {
//				manager.students.get(i).setExpelAt('Y');
//				System.out.println(manager.students.get(i).getName() + " 학생이 제적되었습니다.");
//			}
//		}
//		
//		System.out.println("학생 정보 상황");
//		for (int i=0; i<manager.students.size(); i++) {
//			System.out.println(manager.students.get(i).getName() + "  " + manager.students.get(i).getAge() + "  " + manager.students.get(i).getStudentNum() + "  " + manager.students.get(i).getMajor() + "  " + manager.students.get(i).getExpelAt());
//		}
//		
//		manager.studentExpel.addExpelStudent("홍길동", 22, 20123487, "연극영화과");
//		System.out.println(manager.studentExpel.expelStudents.size());
		
		
		
	}
	
	private void addStudent(String name, int age, int studentNum, String major) {
		int veriStuNum = 0;
		String veriStuNm = "";
		if (students.isEmpty()) {
			Student st = new Student(name, age, studentNum, major);
			students.add(st);
			System.out.println(name + " 학생정보 등록성공!");			
		} else {
			for (int i=0; i<students.size(); i++) {
				if (students.get(i).getStudentNum() == studentNum) {
					veriStuNum = studentNum;
					veriStuNm = name;
				}
			}
			
			if(veriStuNum == 0) {
				Student st = new Student(name, age, studentNum, major);
				students.add(st);
				System.out.println(name + " 학생정보 등록성공!");				
			} else {
				System.out.println(veriStuNm + " 학생의 " + veriStuNum + " 학번은 이미 등록된 학번입니다.");
			}				
		}		
	}
	
	private void method() {
		// TODO Auto-generated method stub
		System.out.println(students.size());
	}
	

}
