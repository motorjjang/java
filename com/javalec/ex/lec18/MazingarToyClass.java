package com.javalec.ex.lec18;

public class MazingarToyClass implements Missile, MoveArmLeg {

	public MazingarToyClass() {
		// TODO Auto-generated constructor stub
		System.out.println("마징가 입니다.");
		canMissile();
		canMoveArmLeg();
		System.out.println("=======================");
	}
	
	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일 발사");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리 움직임");
	}

}
