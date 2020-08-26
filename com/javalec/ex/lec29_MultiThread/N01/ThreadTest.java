package com.javalec.ex.lec29_MultiThread.N01;

public class ThreadTest implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		System.out.println("ThreadTest");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
