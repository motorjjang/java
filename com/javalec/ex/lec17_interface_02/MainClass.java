package com.javalec.ex.lec17_interface_02;

public class MainClass {
	
	public static void main(String[] args) {
	
		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();
		
		IFunction[] iFunction = {aPhone, bPhone, cPhone};
		
		for (int i = 0; i < iFunction.length; i++) {
			iFunction[i].callSenderReceive();
			iFunction[i].canLte();
			iFunction[i].tvRemoteController();
			System.out.println("===========================");
		}
				
	}
}
