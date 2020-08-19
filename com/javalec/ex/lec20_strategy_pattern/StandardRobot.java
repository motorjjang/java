package com.javalec.ex.lec20_strategy_pattern;

public class StandardRobot extends Robot{

	public StandardRobot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionFly() {
		// TODO Auto-generated method stub
		System.out.println("날 수 없습니다.");
	}
	
	public void actionMisail() {
		// TODO Auto-generated method stub
		System.out.println("미사일 쏠 수 있습니다.");
	}
	
	public void actionKnife() {
		// TODO Auto-generated method stub
		System.out.println("목검이 있습니다.");
	}

}
