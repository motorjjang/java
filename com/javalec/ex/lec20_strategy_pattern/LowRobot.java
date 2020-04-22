package com.javalec.ex.lec20_strategy_pattern;

public class LowRobot extends Robot {

	public LowRobot() {
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
		System.out.println("검이 없습니다.");
	}
		
}
