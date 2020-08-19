package com.javalec.ex.lec17_interface_02;

public class APhone implements IFunction {

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("전화송수신 가능 합니다.");
	}

	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("LTE 불가능. 3G만 가능합니다.");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("리모콘 기능 미탑재 입니다.");
	}

}
