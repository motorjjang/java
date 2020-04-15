package com.javalec.ex;

public class Lec03_01 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 3;
		int h = 5;
		
		System.out.println("=== 동등비교, 관계 연산자 ===");
		System.out.println("i == j >> " + (i == j));
		System.out.println("i != j >> " + (i != j));
		System.out.println("i > j >> " + (i > j));
		System.out.println("i < j >> " + (i < j));
		
		System.out.println("\n=== 논리 연산자 ===");
		System.out.println("&&(AND) >> " + (i > j && i > h));
		System.out.println("||(OR) >> " + (i > j || i < h));
		
		System.out.println("\n=== 삼항 연산자 ===");
		int result = h != 5 ? 1 : 2;
		System.out.println("result = " + result);
	}
}
