package com.javalec.ex.lec10_accesstest;

import com.javalec.ex.lec10_accesstest.sub.AccessTest;

public class MainClass {

	private int a = 1000;
	private int b = 2;
	
	public static void main(String[] args) {
		AccessTest accessTest = new AccessTest();
		
		accessTest.a = 100;
		
		accessTest.b = 200;
		
		accessTest.math();
		
		MainClass mainClass = new MainClass();
		System.out.println(accessTest.a);
		System.out.println(mainClass.a);
		System.out.println(mainClass.multi());
	}
	
	private int multi() {
		return this.a * this.b;
	}
}
