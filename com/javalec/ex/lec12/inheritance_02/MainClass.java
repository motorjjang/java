package com.javalec.ex.lec12.inheritance_02;

public class MainClass {

	public static void main(String[] args) {
		ChildMenu childMenu = new ChildMenu();
		
		childMenu.makeChungGukJang();
		childMenu.makeDoenJangGuk();
		childMenu.makeGalbiJjim();
		childMenu.makeSoyBean();
		
		childMenu.makeBeefChungGukJang();
		childMenu.makeHotDoenJangGuk();
		childMenu.makeKongNaMool();
		
		System.out.println();
		ParentMenu parentMenu = new ChildMenu();
		parentMenu.makeChungGukJang();
	}
}
