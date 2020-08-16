package com.javalec.ex.lec11.children;

import com.javalec.ex.lec11.papa.PapaPouch;

public class FirstChild {

	public FirstChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY -= money;
		if (PapaPouch.MONEY < 0) {
			System.out.println("첫째는 돈이 없어 못받았어요.");
		}
	}
}
