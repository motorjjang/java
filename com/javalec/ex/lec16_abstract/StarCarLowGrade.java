package com.javalec.ex.lec16_abstract;

public class StarCarLowGrade extends StarCar {

	private int tax = 1000;
	
	public StarCarLowGrade(String color, String tire, int displacement, String handle) {
		super(color, tire, displacement, handle);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getSpec() {
		// TODO Auto-generated method stub
		System.out.println("***************************");
		System.out.println("색상 : " + color);
		System.out.println("타이어 : " + tire);
		System.out.println("배기량 : " + displacement);
		System.out.println("핸들 : " + handle);
		
		if(displacement > 2000) tax = 1500;
		System.out.println("세금 : " + tax);
		System.out.println("***************************");
	}

}
