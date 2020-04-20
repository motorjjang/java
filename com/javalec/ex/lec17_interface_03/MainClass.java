package com.javalec.ex.lec17_interface_03;

public class MainClass {

	public static void main(String[] args) {
		
		Actress actress = new Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.makePizza();
		actress.makeSpaghetti();
		actress.outFire();
		actress.saveMan();
		
		Chef chef = new Actress();
		chef.makePizza();
		chef.makeSpaghetti();
	}
}
