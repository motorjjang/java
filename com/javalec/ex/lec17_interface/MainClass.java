package com.javalec.ex.lec17_interface;

public class MainClass {

	public static void main(String[] args) {
		InterfaceClass ifc = new InterfaceClass();
		
		ifc.getStr();
		ifc.calculate();
		
		InterfaceEx ife = new InterfaceClass();
		InterfaceEx2 ife2 = new InterfaceClass();
		
		ife.calculate();
		ife2.getStr();
	}
}
