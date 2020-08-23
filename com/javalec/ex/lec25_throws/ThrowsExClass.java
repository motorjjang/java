package com.javalec.ex.lec25_throws;

public class ThrowsExClass {

	public ThrowsExClass() {
		// TODO Auto-generated constructor stub
		actionC();
	}
	
	private void actionA() throws Exception {	//actionA()를 호출한 곳으로 예외를 던진다.
		System.out.println("actionA");
		
		int[] iArr = {1, 2, 3, 4};
		System.out.println(iArr[4]);
		
		System.out.println("actionAA");
	}
	
	private void actionB() {
		System.out.println("actionB");
		
		try {
			actionA();
		} catch (Exception e) {
			System.out.println("예외는 여기서 처리 할께요.^^");
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("actionBB");
	}
	
	private void actionC() {
		System.out.println("actionC");
		actionB();
		System.out.println("actionCC");
	}
	
	/*
		--일반적으로 많이 보게 되는 예외들
		ArrayIndexOutOfBoundsException > 배열을 사용시 존재하지 않는 index값을 호출하면 발생 합니다.
		
		NullPointerException > 존재하지 않는 객체를 가리킬 때 발생 합니다.
		String str = null;
		char c = str.charAt(0);		==> 존재하는 객체가 없다.
		
		NumberFormatException > 문자를 숫자로 처리할때 발생
		String str = "aa";
		int i = 10;
		int j = Integer.parseInt(str) + i;	==> 숫자로 변경할 수 없는 문자열을 변경하려고 함.
		
		--DB관련 Exception
		ClassNotFoundException : 드라이브 이름을 찾지 못했을때
		SQLException : db url, id, pw가 올바르지 않을때
	 */
}

