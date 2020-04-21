package com.javalec.ex.lec18;

public class AirPlaneToyClass implements Missile, Light {

	public AirPlaneToyClass() {
		System.out.println("비행기 입니다.");
		canLight();
		canMissile();
		System.out.println("======================================");
	}
	
	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("불빛 발사 가능합니다.");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사할 수 있습니다.");
	}

	
}
