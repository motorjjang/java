package com.javalec.ex.lec27_collection.HashSet_02;

import java.util.HashSet;

public class MainClass {

	public static void main(String[] args) {
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		Student student1 = new Student("홍길동", 3);
		
		
		hashSet.add(student1);
		hashSet.add(new Student("이순신", 6));
		hashSet.add(new Student("장보고", 1));
		
		System.out.println(hashSet.toString());
		
		hashSet.remove(student1);
		System.out.println(hashSet.toString());
		
		Student student2 = new Student("이순신", 6);
		hashSet.remove(student2);
		System.out.println(hashSet.toString());
		
	}
}
