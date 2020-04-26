package com.javalec.ex.lec23_API_02.Random;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		double d2 = Math.random() * 100;
		System.out.println((int)d2);
				
		Random random = new Random();
		int r = random.nextInt(100);
		int r2 = random.nextInt();
		System.out.println(r);
		System.out.println(r2);
	}
}
