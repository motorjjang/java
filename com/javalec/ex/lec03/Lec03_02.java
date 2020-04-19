package com.javalec.ex.lec03;

import java.util.Scanner;

public class Lec03_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		
		System.out.println("i�� 3���� ����� �������� 0�� ������ ����ڰ� �Է��� ���ڴ� 3�� ��� �Դϴ�.");
		System.out.println("i % 3 = " + (i % 3));
		
		int j = i % 3;
		if (j == 0) {
			System.out.println(i + "�� 3�� ��� �Դϴ�.");
		} else {
			System.out.println(i + "�� 3�� ����� �ƴմϴ�.");
		}

		scanner.close();
	}

}
