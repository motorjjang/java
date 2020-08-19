package com.javalec.ex.lec19_singleton_pattern;

public class FirstClass {

	public FirstClass() {
		// TODO Auto-generated constructor stub
		SingletonClass singletonClass = SingletonClass.getSingletonClass();
		singletonClass.getI();
		System.out.println("FirstClass");
		System.out.println("i = " + singletonClass.getI());
		singletonClass.setI(200);
		System.out.println("i = " + singletonClass.getI());
	}
	
	public int get() {
		SingletonClass singletonClass = SingletonClass.getSingletonClass();		
		return singletonClass.getI(); 
	}
}
