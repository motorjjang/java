package com.javalec.ex.lec18;

public class AplaneClass implements Missile, Light {

	public AplaneClass() {
		// TODO Auto-generated constructor stub
		System.out.println("비행기 입니다.");
		canLight();
		canMissile();
		System.out.println("=======================");
	}
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛 발사");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}

}
