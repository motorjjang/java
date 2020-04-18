package com.javalec.ex.lec08;

public class MainClass {

	public static void main(String[] args) {
		ManClass mc01 = new ManClass();
		mc01.setAge(22);
		System.out.println(mc01.getAge());
		
		ManClass mc02 = new ManClass(23, 175, 70, "010-2222-3333");
		System.out.println(mc02.getAge());
		System.out.println(mc02.calculateBMI());
		
		WomanClass wc = new WomanClass();
		WomanClass wc1 = new WomanClass();
		
		System.out.println(wc.equals(wc1));
	}
}
