package com.javalec.ex.lec06;

import java.util.Scanner;

public class Lec06 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		Scanner inputNum = new Scanner(System.in);
		int param = inputNum.nextInt();
		
		Lec06 lec06_01 = new Lec06();
		lec06_01.gugudan(param);
		inputNum.close();
	}
	
	public void gugudan(int i) {
		int j = 1;
		while (j < 10) {
			int result = i * j;
			System.out.printf("%d * %d = %d", i, j, result);
			System.out.println();
			j++;
		}
	}
}
