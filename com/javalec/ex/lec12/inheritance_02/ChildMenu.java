package com.javalec.ex.lec12.inheritance_02;

public class ChildMenu extends ParentMenu {

	public ChildMenu() {
		System.out.println("자식 클래스");
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("쇠고기 청국장");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("얼큰 된장국");
	}
	
	public void makeKongNaMool() {
		System.out.println("콩나물국");
	}
	
	@Override
	public void makeChungGukJang() {
		System.out.println("냄새없는 청국장");
	}
	
	@Override
	public void makeGalbiJjim() {
		// TODO Auto-generated method stub
		super.makeGalbiJjim();
		System.out.println("갈비찜 오버라이드");
	}
}
