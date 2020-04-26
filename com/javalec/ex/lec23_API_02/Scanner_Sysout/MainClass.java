package com.javalec.ex.lec23_API_02.Scanner_Sysout;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println("i = " + i);
		
		String str0 = scanner.next();
		System.out.println("str0 = " + str0);
		
		String str1 = scanner.nextLine();
		System.out.println("str1 = " + str1);
		
		String str2 = scanner.nextLine();
		System.out.println("str2 = " + str2);
		
		System.out.println("END");
	}
}
