package com.javalec.ex.lec13.inheritance_03;

public class ChildClass extends ParentClass {

	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("ChildClass");
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
		System.out.println("부모 클래스의 method()를 실행하고, 자식 클래스의 나머지 작업을 합니다.");
	}
}
