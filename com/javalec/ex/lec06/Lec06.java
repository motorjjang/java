package com.javalec.ex.lec06;

import java.util.Scanner;

public class Lec06 {
	
	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in);
		int param = sc.nextInt();
		
		Gugudan gugudan = new Gugudan();
		gugudan.gugudan(param);
	}
}
