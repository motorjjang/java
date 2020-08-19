package com.javalec.ex.lec17_interface_03;

public class MainClass {

	public static void main(String[] args) {
		
		Actress actress = new Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		
		PoliceMan pActor = new Actress();
		pActor.canCatchCriminal();
		pActor.canSearch();
		
		FireFighter fActor = new Actress();
		fActor.outFire();
		fActor.saveMan();
		
		Chef cActor = new Actress();
		cActor.makePizza();
		cActor.makeSpaghetti();
	}
}
