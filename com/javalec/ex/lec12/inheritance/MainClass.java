package com.javalec.ex.lec12.inheritance;

public class MainClass {

	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		
		System.out.print("�ƺ� �̸� : ");		
		childClass.getPapaName();
		
		System.out.println();
		System.out.print("���� �̸� : ");
		childClass.getMamiName();
		
		System.out.println();
		System.out.print("�Ƶ� �̸� : ");
		childClass.getChildName();
		
		System.out.println();
		System.out.println(childClass.pStr);
		System.out.println(childClass.cStr);
	}
}
