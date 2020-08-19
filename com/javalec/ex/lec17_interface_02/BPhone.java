package com.javalec.ex.lec17_interface_02;

public class BPhone implements IFunction {

	@Override
	public void callSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("전화 송수신 가능합니다.");
	}

	@Override
	public void canLte() {
		// TODO Auto-generated method stub
		System.out.println("4G LTE가능 합니다.");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("리모콘 기능 탑재되어 있습니다.");
	}

}
