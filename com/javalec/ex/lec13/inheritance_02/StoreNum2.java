package com.javalec.ex.lec13.inheritance_02;

public class StoreNum2 extends HeadQuaterStore {

	public StoreNum2() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderBuDaejjige() {
		// TODO Auto-generated method stub
		System.out.println("5,000원 입니다.");
	}
	
	@Override
	public void orderBiBimbap() {
		// TODO Auto-generated method stub
		System.out.println("5,000원 입니다.");
	}
	
	@Override
	public void orderSunDaeguk() {
		// TODO Auto-generated method stub
		System.out.println("4,000원 입니다.");
	}
	
	@Override
	public void orderGongGibap() {
		// TODO Auto-generated method stub
		System.out.println("무료 입니다.");
	}
}
