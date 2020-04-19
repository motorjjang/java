package com.javalec.ex.lec04;

import java.util.Scanner;

public class Lec04_01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		// if(���ǽ�)
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		
		System.out.println();
		
		// if(���ǽ�) else
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		} else {
			System.out.println("num1�� num2���� ũ�ų� ����.");
		}
		
		System.out.println();
		
		// if(���ǽ�) else if(���ǽ�)
		if(num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		} else if(num1 > num2){
			System.out.println("num1�� num2���� ũ��.");
		} else {
			System.out.println("num1�� num2�� ����.");
		}
		
		System.out.println();
		
		// switch��
		System.out.print("������ �Է��ϼ���. : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("��");
			break;
			
		case 8:
			System.out.println("��");
			break;
			
		case 7:
			System.out.println("��");
			break;

		default:
			System.out.println("try again!!");
			break;
		}
		
		inputNum.close();
	}	
}
