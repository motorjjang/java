package com.javalec.ex.lec12.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		
		System.out.print("아빠 이름 : ");		
		childClass.getPapaName();
		
		System.out.println();
		System.out.print("엄마 이름 : ");
		childClass.getMamiName();
		
		System.out.println();
		System.out.print("아들 이름 : ");
		childClass.getChildName();
		
		System.out.println();
		System.out.println(childClass.pStr);
		System.out.println(childClass.cStr);
	}
}
