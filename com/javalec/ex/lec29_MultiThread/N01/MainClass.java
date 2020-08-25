package com.javalec.ex.lec29_MultiThread.N01;

public class MainClass {
	
	public static void main(String[] args) {
		
		ThreadTest threadTest = new ThreadTest();
		
		Thread thread = new Thread(threadTest, "A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
