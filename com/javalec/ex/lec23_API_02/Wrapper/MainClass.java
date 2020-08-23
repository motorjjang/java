package com.javalec.ex.lec23_API_02.Wrapper;

public class MainClass {

	/*
		--Wrapper 클래스
			기초데이터를 객체데이터로 변환 합니다.
			Wrapper클래스는 기초데이터를 객체데이터로 변화시키는 클래스 입니다.
		
		
		기초데이터에 상응하는 객체데이터
		기초데이터	객체데이터
		byte		Byte
		short		Short
		int			Integer
		long		Long
		double		Double
		float		Float
		boolean		Boolean
		char		Character
	 * */
	
	public static void main(String[] args) {
		
		Integer integer = new Integer(10);
		int i = integer.intValue();
		double d = integer.doubleValue();
		
		System.out.println("i = " + i);
		System.out.println("d = " + d);
		
		String str = "123";
		int int_str = Integer.parseInt(str);
		
		int test = 123;
		String test_convert = Integer.toString(test);
		System.out.println(test_convert + 1);
		
		System.out.println("str : " + (str + 1));
		System.out.println("int_str : " + (int_str + 1));
		
		Integer iii = 10;
		System.out.println(iii.intValue());
		System.out.println(iii);
		if (iii == 10) {
			System.out.println("True");
		}
	}
}
