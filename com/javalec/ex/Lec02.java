package com.javalec.ex;

public class Lec02 {
	public static void main(String[] args) {
	
//		int i = 10;
//		int j = 20;
//		int h = 30;
//		
//		char c = 'A';
//		char d = 'a';
//		char e = 'B';
//		
//		System.out.println(i);
//		System.out.println(j);
//		System.out.println(h);
//		
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		char c = 'C';
		int i = 10;
		double d = 3.14D;
		boolean b = true;
		
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(b);
		
		//묵시적 형변환
		int i1 = 10;
		double d1 = i1;
		System.out.println("d1 데이터는 " + d1 + "입니다.");

		//명시적 형변환		
		double d2 = 10.14D;
		int i2 = (int)d2;
		System.out.println("i2 데이터는 " + i2 + "입니다.");
	}
}
