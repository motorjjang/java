package com.javalec.ex.lec11.children;

import com.javalec.ex.lec11.father.FatherWallet;

public class FirstChild {

	public FirstChild() {
		
	}
	
	public void takeMoney(int money) {
		FatherWallet.MONEY = FatherWallet.MONEY - money;
		if (FatherWallet.MONEY < 0) {
			System.out.println("ù°�� ���� ���� ���޾Ҿ��Ф�");
			FatherWallet.MONEY = FatherWallet.MONEY + money;
		} else {
			System.out.println("ù°�� " + money + "���� ���������ϴ�.");
		}
	}
}
