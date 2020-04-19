package com.javalec.ex.lec03;

import java.util.Scanner;

public class Lec03_03_CalEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		System.out.println("i % 3 = " + (i % 3));
		sc.close();
	}
}
