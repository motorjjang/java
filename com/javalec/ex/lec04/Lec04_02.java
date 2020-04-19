package com.javalec.ex.lec04;

import java.util.Scanner;

public class Lec04_02 {
	
	public static void main(String[] args) {
		
		// for��
		System.out.print("INPUT NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		
		System.out.println();
		
		// while��
		System.out.print("INPUT NUMBER : ");
		int num = scanner.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		}
		
		scanner.close();
		
		System.out.println();
		
		// do ~ while��
		do {
			System.out.println("������ 1���� �����մϴ�.");
		} while (false);
		

	}
}
