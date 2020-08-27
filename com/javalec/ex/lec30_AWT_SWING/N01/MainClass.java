package com.javalec.ex.lec30_AWT_SWING.N01;

import java.awt.Dimension;

public class MainClass {

	public static void main(String[] args) {
		
		MakeBtn btn = new MakeBtn();
//		btn.pack();
		btn.setSize(new Dimension(200, 100));
		btn.setVisible(true);
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
		btn.setVisible(false);
		btn.dispose();
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		
		System.exit(0);
	}
}

/**
 * pack() : 컴포넌트이 사이즈를 정함.
 * setSize() : 컴포넌트의 사이즈를 개발자가 정함
 * setVisible(true) : 화면에 출력함.
 * dispose() : 자원 해제
 * System.exit() : 애플리케이션 종료.
 */
