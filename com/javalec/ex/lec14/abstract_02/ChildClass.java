package com.javalec.ex.lec14.abstract_02;

public class ChildClass extends SuperClass {

	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass 입니다.");
	}
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("ChildClass의 method1 입니다.");
	}
	
	@Override
	void method2() {
		// TODO Auto-generated method stub
		super.method2();
	}

}
