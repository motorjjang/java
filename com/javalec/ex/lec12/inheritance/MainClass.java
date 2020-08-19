package com.javalec.ex.lec12.inheritance;

public class MainClass {

	public static void main(String[] args) {
		ChildClass cC = new ChildClass();
		System.out.print("아버지 이름 : ");
		cC.getPapaNm();
		System.out.print("어머니 이름 : ");
		cC.getMamiNm();
		
		System.out.println(cC.cStr);
		
	}
}
