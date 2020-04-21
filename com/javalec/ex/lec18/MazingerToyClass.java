package com.javalec.ex.lec18;

public class MazingerToyClass implements Missile, MoveArmLeg{

	public MazingerToyClass() {
		System.out.println("마징가 입니다.");
		canMoveArmLeg();
		canMissile();
		System.out.println("===================================");
	}
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔다리를 움직일 수 있습니다.");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사할 수 있습니다.");
	}

}
