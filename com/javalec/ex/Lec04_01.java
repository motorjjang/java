package com.javalec.ex;

import java.util.Scanner;

public class Lec04_01 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		// if(조건식)
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		}
		
		System.out.println();
		
		// if(조건식) else
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else {
			System.out.println("num1는 num2보다 크거나 같다.");
		}
		
		System.out.println();
		
		// if(조건식) else if(조건식)
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else if(num1 > num2){
			System.out.println("num1는 num2보다 크다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}
		
		System.out.println();
		
		// switch문
		System.out.print("점수를 입력하세요. : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch (score / 10) {
		case 10:
		case 9:
			System.out.println("수");
			break;
			
		case 8:
			System.out.println("우");
			break;
			
		case 7:
			System.out.println("미");
			break;

		default:
			System.out.println("try again!!");
			break;
		}
		
		inputNum.close();
	}	
}
