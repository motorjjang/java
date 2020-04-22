package com.javalec.ex.lec19_singleton_pattern;

public class MainClass {

	public static void main(String[] args) {
		
		FirstClass firstClass = new FirstClass();
		SecondClass secondClass = new SecondClass();

		System.out.println(firstClass.get());
	}
}
