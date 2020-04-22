package com.javalec.ex.lec20_strategy_pattern;

public class StandardRobot extends Robot {

	public StandardRobot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날수 없습니다.");
	}
	
	public void actionMissile() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 쏠수 있습니다.");
	}
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("목검이 있습니다.");
	}
}
