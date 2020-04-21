package com.javalec.ex.lec18;

public class MainClass {

	public static void main(String[] args) {
		
		Toy pooh = new PoohToyClass();
		MoveArmLeg pooh2 = new PoohToyClass();
		PoohToyClass pooh3 = new PoohToyClass();
		
		Toy mazinger = new MazingerToyClass();
		Toy airPlaToy = new AirPlaneToyClass();
		
		Toy[] toy = {pooh, mazinger, airPlaToy};
		for (int i = 0; i < toy.length; i++) {
			 
		}
	}
}
