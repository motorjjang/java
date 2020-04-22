package com.javalec.ex.lec20_strategy_pattern;

public class MainClass {

	public static void main(String[] args) {
		
		SuperRobot superRobot = new SuperRobot();
		StandardRobot standardRobot = new StandardRobot();
		
		superRobot.actionWalk();
	}
}
