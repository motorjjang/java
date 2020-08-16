package com.javalec.ex.lec11.children;

import com.javalec.ex.lec11.papa.PapaPouch;

public class ThirdChild {

	public ThirdChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		PapaPouch.MONEY -= money;
		if(PapaPouch.MONEY < 0) {
			System.out.println("셋째는 돈을 못받았어요.");
		}
	}
}
