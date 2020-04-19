package com.javalec.ex.lec11.staticex2;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(PiClass.PI);
		
		PiClass.PI = PiClass.PI - 1;
		
		PiClass piclass = new PiClass();
		System.out.println(PiClass.PI);
	}
}
