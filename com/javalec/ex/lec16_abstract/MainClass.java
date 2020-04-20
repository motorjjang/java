package com.javalec.ex.lec16_abstract;

public class MainClass {

	public static void main(String[] args) {
		
		StarCar StarCarLowGrade = new StarCarLowGrade(CarSpecs.COLOR_BLUE, CarSpecs.TIRE_NORMAL, CarSpecs.DISPLACEMENT_2000, CarSpecs.HANDLE_NORMAL);
		StarCar StarCarHighGrade = new StarCarHighGrade(CarSpecs.COLOR_RED, CarSpecs.TIRE_WIDE, CarSpecs.DISPLACEMENT_2200, CarSpecs.HANDLE_POWER);
		
		StarCarLowGrade.getSpec();
		StarCarHighGrade.getSpec();
		
		
	}
}
