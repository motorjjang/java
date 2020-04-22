package com.javalec.ex.lec21_strategy_pattern;

import com.javalec.ex.lec21_strategy_pattern.inter.FlyYes;
import com.javalec.ex.lec21_strategy_pattern.inter.KnifeLazer;
import com.javalec.ex.lec21_strategy_pattern.inter.MissileYes;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("SuperRobot을 만들어 주세요.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
//		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
//		superRobot.setMissile(new MissileYes());
		superRobot.actionMissile();
//		superRobot.setKnife(new KnifeLazer());
		superRobot.actionKnife();
		
		System.out.println();
		Robot standardRobot = new StandardRobot();
		standardRobot.shape();
	}
}
