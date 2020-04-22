package com.javalec.ex.lec19_singleton_pattern;

public class FirstClass {

	public FirstClass() {
		// TODO Auto-generated constructor stub
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		singletonClass.get();
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.get());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.get());
	}
	
	public int get() {
		SingletonClass singletonClass = SingletonClass.getSingletonClass();		
		return singletonClass.get(); 
	}
}
