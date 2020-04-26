package com.javalec.ex.lec22_API.currentTimeMillis;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		String str = "A";
		long startNum = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			str = str + "A";
		}
		
		long endNum = System.currentTimeMillis();
		System.out.println("경과시간 : " + (endNum - startNum));
		
		
		StringBuilder stringBuilder = new StringBuilder("A");
		long startNum1 = System.currentTimeMillis();
		for (int i = 0; i < 200000; i++) {
			stringBuilder = stringBuilder.append("A");
		}
		
		long endNum1 = System.currentTimeMillis();
		System.out.println("경과시간 : " + (endNum1 - startNum1));
	}
}
