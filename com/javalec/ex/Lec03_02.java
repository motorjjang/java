package com.javalec.ex;

import java.util.Scanner;

public class Lec03_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		System.out.println("i를 3으로 나누어서 나머지가 0이 나오면 사용자가 입력한 숫자는 3의 배수 입니다.");
		System.out.println("i % 3 = " + (i % 3));
		
		int j = i % 3;
		if (j == 0) {
			System.out.println(i + "는 3의 배수 입니다.");
		} else {
			System.out.println(i + "는 3의 배수가 아닙니다.");
		}

		scanner.close();
	}

}
