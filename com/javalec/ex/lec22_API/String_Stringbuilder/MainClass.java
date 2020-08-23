package com.javalec.ex.lec22_API.String_Stringbuilder;

public class MainClass {

	public static void main(String[] args) {
		
		String str1 = "abcdefg";
		String str2 = "HIJKLMN";
		String str3 = "opqrstu";
		String strTest = "tel : 010-7673-2030";
		
		System.out.println(strTest.replaceAll("[^0-9]", ""));
		System.out.println(str1.replace("ab", "cd"));
		
		//concat : 문자열 연결
		System.out.println(str1.concat(str2));
		
		//substring : 문자열 자르기
		System.out.println(str1.substring(3));
		
		//length : 문자열 길이
		System.out.println(str1.length());
		
		//toUpperCase : 대문자로 만들기
		System.out.println(str1.toUpperCase());
		
		//toLowerCase : 소문자로 만들기
		System.out.println(str1.toLowerCase());
		
		//charAt : 특정위치의 글자 찾기
		System.out.println(str1.charAt(3));
		
		//indexOf : 특정문자열 위치
		System.out.println(str1.indexOf('c'));
		
		//equals : 문자열 비교
		String str4 = "abcdefg";
		System.out.println(str1.equals(str4));
		
		//trim : 문자열 공백제거
		String str5 = " abc def ghi ";
		System.out.println(str5.trim());
		
		//replace : 특정문자 변경
		System.out.println(str1.replace('a', 'Z'));
		
		//replaceAll : 특정문자열 변경
		System.out.println(str1.replaceAll("abcd", "ZZZZZZZ"));
		
		System.out.println(str1);		
		System.out.println();
		
		
		//StringBuilder
		StringBuilder stringBuilder = new StringBuilder("abcdefg");
		
		//Append : 문자열 추가
		System.out.println(stringBuilder.append("hijklmn"));
		
		//insert : 특정 위치에 문자열 추가
		System.out.println(stringBuilder.insert(3, "AAA"));
		
		//delete : 문자열 삭제
		System.out.println(stringBuilder.delete(3, 5));
		
		//deleteCharAt : 특정 문자 하나 삭제
		System.out.println(stringBuilder.deleteCharAt(10));		
		System.out.println(stringBuilder);
		
		String s10 = "분만(암암)";
		//System.out.println(s10.replace("분만(", "").replace(")",""));
		System.out.println(s10.replaceAll("[분만()]", ""));
		
		int start = s10.indexOf('(');
		int end = s10.indexOf(')');
		//System.out.println(s10.substring(start + 1, end));
	}
}
