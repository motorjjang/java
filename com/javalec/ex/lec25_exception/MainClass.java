package com.javalec.ex.lec25_exception;

public class MainClass {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println(i * j);
		try {
			System.out.println(i / j);			
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		} catch (NumberFormatException n) {
			n.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("무조건 실행합니다.");
		}
		System.out.println(i + j);
		System.out.println(i - j);
	}		
}
