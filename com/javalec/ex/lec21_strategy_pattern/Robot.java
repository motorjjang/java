package com.javalec.ex.lec21_strategy_pattern;

import com.javalec.ex.lec21_strategy_pattern.inter.IFly;
import com.javalec.ex.lec21_strategy_pattern.inter.IKnife;
import com.javalec.ex.lec21_strategy_pattern.inter.IMissile;

public abstract class Robot {

	private IFly fly;
	private IMissile missile;
	private IKnife knife;
	
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
	
	public abstract void shape();
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMissile(IMissile missile) {
		this.missile = missile;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	
	public void actionFly() {
		this.fly.fly();
	}
	
	public void actionMissile() {
		this.missile.missile();
	}
	
	public void actionKnife() {
		this.knife.knife();
	}
}
