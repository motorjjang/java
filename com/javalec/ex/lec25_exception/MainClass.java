package com.javalec.ex.lec25_exception;

public class MainClass {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i * j);
		try {
			System.out.println(i / j);
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
		System.out.println(i + j);
		System.out.println(i - j);
		
		int[] iArr = {1, 2, 3};
		
		try {
			System.out.println("*****************");
			System.out.println(iArr[3]);
			System.out.println("=================");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행합니다.");
		}
	}
}
