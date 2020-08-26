package com.javalec.ex.lec29_MultiThread.N02;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("8");
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
