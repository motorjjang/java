package com.javalec.ex.lec27_collection.HashSet_02;

public class Student {
	
	private String name;
	private int grade;
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + grade;
	}
	
	@Override
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.contentEquals(compareValue);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return toString().hashCode();
	}
}
