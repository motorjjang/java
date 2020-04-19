package com.javalec.ex.lec03;

public class Lec03_01 {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 3;
		int h = 5;
		
		System.out.println("=== �����, ���� ������ ===");
		System.out.println("i == j >> " + (i == j));
		System.out.println("i != j >> " + (i != j));
		System.out.println("i > j >> " + (i > j));
		System.out.println("i < j >> " + (i < j));
		
		System.out.println("\n=== �� ������ ===");
		System.out.println("&&(AND) >> " + (i > j && i > h));
		System.out.println("||(OR) >> " + (i > j || i < h));
		
		System.out.println("\n=== ���� ������ ===");
		int result = h != 5 ? 1 : 2;
		System.out.println("result = " + result);
	}
}
