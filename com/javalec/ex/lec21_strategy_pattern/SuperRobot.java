package com.javalec.ex.lec21_strategy_pattern;

import com.javalec.ex.lec21_strategy_pattern.inter.FlyYes;
import com.javalec.ex.lec21_strategy_pattern.inter.KnifeLazer;
import com.javalec.ex.lec21_strategy_pattern.inter.MissileYes;

public class SuperRobot extends Robot {

	public SuperRobot() {
		setFly(new FlyYes());
		setMissile(new MissileYes());
		setKnife(new KnifeLazer());
	}

	@Override
	public void shape() {
		System.out.println("수퍼로봇 입니다.");
	}
	
}
