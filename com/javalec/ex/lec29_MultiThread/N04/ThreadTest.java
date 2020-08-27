package com.javalec.ex.lec29_MultiThread.N04;

public class ThreadTest implements Runnable {

	int testNum = 0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			if (Thread.currentThread().getName().equals("A")) {
				System.out.println("===================================");
				testNum++;
			}
			System.out.println("Thread Name : " + Thread.currentThread().getName() + ", testNum : " + testNum);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
