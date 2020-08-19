package com.javalec.ex.lec14.abstract_02;

public abstract class SuperClass {

	public SuperClass() {
		// TODO Auto-generated constructor stub
		System.out.println("SuperClass 입니다.");
	}
	
	abstract void method1();
	
	void method2() {
		System.out.println("SuperClass의 mothod2 입니다.");
	}
}
