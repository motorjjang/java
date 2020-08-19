package com.javalec.ex.lec17_interface_02;

public class MainClass {

	public static void main(String[] args) {
		//APhone aPhone = new APhone();
		//BPhone bPhone = new BPhone();
		//CPhone cPhone = new CPhone();
		
		IFunction aPhone = new APhone();
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();
		
		IFunction[] iFunctions = {aPhone, bPhone, cPhone};
		
		for (IFunction i : iFunctions) {
			i.callSenderReceive();
			i.canLte();
			i.tvRemoteController();
			System.out.println("================================");
		}
	}
}
