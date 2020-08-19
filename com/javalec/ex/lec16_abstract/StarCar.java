package com.javalec.ex.lec16_abstract;

public abstract class StarCar {

	String color;
	String tire;
	int displacement;
	String handle;
	
	public StarCar(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.tire = tire;
		this.displacement = displacement;
		this.handle = handle;
	}
	
	abstract void getSpec();
}
