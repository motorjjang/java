package com.javalec.ex.lec13.inheritance_02;

public class StoreNum1 extends HeadQuaterStore {

	public StoreNum1() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void orderKimChijjige() {
		// TODO Auto-generated method stub
		System.out.println("4,500원 입니다.");
	}
	
	@Override
	public void orderBuDaejjige() {
		// TODO Auto-generated method stub
		System.out.println("5,000원 입니다.");
	}
	
	@Override
	public void orderSunDaeguk() {
		// TODO Auto-generated method stub
		System.out.println("판매하지 않습니다.");
	}
	
	public void orderTest() {
		System.out.println("orderTest");
	}
	
}
