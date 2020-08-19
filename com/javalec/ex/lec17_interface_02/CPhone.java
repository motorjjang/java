package com.javalec.ex.lec17_interface_02;

public class CPhone implements IFunction {

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("전화 송수신 가능합니다.");
	}

	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("가능합니다. 4G 입니다.");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("리모콘 미탑재 되어 있습니다.");
	}

}
