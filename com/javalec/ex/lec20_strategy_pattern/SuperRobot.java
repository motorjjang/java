package com.javalec.ex.lec20_strategy_pattern;

public class SuperRobot extends Robot{

	public SuperRobot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 있습니다.");
	}

	@Override
	public void actionMisail() {
		// TODO Auto-generated method stub
		System.out.println("미사일 쏠 수 있습니다.");
	}

	@Override
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("레이저검이 있습니다.");
	}
	


}
