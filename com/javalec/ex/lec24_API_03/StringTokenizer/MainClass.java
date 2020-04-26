package com.javalec.ex.lec24_API_03.StringTokenizer;

import java.util.StringTokenizer;

public class MainClass {

	public static void main(String[] args) {
		
		String str1 = "오늘 날씨는 춥고, 눈이 많이 오고 있습니다.";
		String str2 = "2014/12/25";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println();
		
		StringTokenizer tokenizer1 = new StringTokenizer(str1);
		StringTokenizer tokenizer2 = new StringTokenizer(str2, "/");
		StringTokenizer tokenizer3 = new StringTokenizer(str1,",");
		
		System.out.println("tokenizer1 문자열 수 : " + tokenizer1.countTokens());
		System.out.println("tokenizer2 문자열 수 : " + tokenizer2.countTokens());
		System.out.println("tokenizer3 문자열 수 : " + tokenizer3.countTokens());
		System.out.println();
		
		while (tokenizer1.hasMoreTokens()) {
			System.out.println(tokenizer1.nextToken());
		}
		System.out.println();
		
		while (tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
		System.out.println();
		while (tokenizer3.hasMoreTokens()) {
			System.out.println(tokenizer3.nextToken());
		}
	}
}
