package com.javalec.ex.lec17_interface_03;

public class Actress implements Chef, FireFighter, PoliceMan {

	@Override
	public void canCatchCriminal() {
		System.out.println("범죄자를 잡을수 있습니다.");
		
	}

	@Override
	public void canSearch() {
		System.out.println("수색할 수 있습니다.");
		
	}

	@Override
	public void outFire() {
		System.out.println("화재를 진압할수 있습니다.");
		
	}

	@Override
	public void saveMan() {
		System.out.println("사람을 구할수 있습니다.");
		
	}

	@Override
	public void makePizza() {
		System.out.println("피자를 만들수 있습니다.");
		
	}

	@Override
	public void makeSpaghetti() {
		System.out.println("스파게티를 만들수 있습니다.");
		
	}

	
}
