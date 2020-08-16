package com.javalec.ex.lec11.staticex;

import com.javalec.ex.lec11.children.FirstChild;
import com.javalec.ex.lec11.children.SecondChild;
import com.javalec.ex.lec11.children.ThirdChild;
import com.javalec.ex.lec11.papa.PapaPouch;
import com.javalec.ex.lec11.staticex2.PiClass;

public class MainClass {

	public static void main(String[] args) {
		
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(100);
		
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(100);
		
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(100);
		
		System.out.println("남은돈 : " + PapaPouch.MONEY);
		PapaPouch.MONEY = 200;
		System.out.println("남은돈 : " + PapaPouch.MONEY);
		
		System.out.println(PiClass.PI);
	}
}
