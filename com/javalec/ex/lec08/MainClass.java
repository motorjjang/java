package com.javalec.ex.lec08;

public class MainClass {

	public static void main(String[] args) {
		ManClass mc = new ManClass();
		ManClass mc1 = new ManClass(15, 168, 58, "010-1234-1234");
		
		mc.getAge();
		mc.setAge(16);
		
		System.out.println(mc1.calculateBMI());
		
		System.out.println(mc1.getAge() + ", " + mc1.getHeight() + ", " + mc1.getWeight() + ", " + mc1.getPhoneNum());
		mc1.setAge(25);
		System.out.println(mc1.getAge() + ", " + mc1.getHeight() + ", " + mc1.getWeight() + ", " + mc1.getPhoneNum());
	}
}
