package com.javalec.ex.lec20_strategy_pattern;

public abstract class Robot {

	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을수 있습니다.");
	}
	
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("달릴수 있습니다.");
	}
	
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("SuperRobot 입니다. 외형은 팔, 다리, 몸통, 머리가 있습니다.");
	}
	
	public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionKnife();
}
