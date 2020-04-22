package com.javalec.ex.lec19_singleton_pattern;

public class SecondClass {

	public SecondClass() {
		// TODO Auto-generated constructor stub
		
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		System.out.println("SecondClass");
		System.out.println("i = " + singletonClass.get());
	}
}
