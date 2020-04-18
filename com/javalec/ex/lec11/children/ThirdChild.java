package com.javalec.ex.lec11.children;

import com.javalec.ex.lec11.father.FatherWallet;

public class ThirdChild {

	public ThirdChild() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		FatherWallet.MONEY = FatherWallet.MONEY - money;
		if (FatherWallet.MONEY < 0) {
			System.out.println("셋째는 돈이 없어 못받았어요ㅠㅠ");
			FatherWallet.MONEY = FatherWallet.MONEY + money;
		} else {
			System.out.println("셋째는 " + money + "원을 가져갔습니다.");
		}
	}
}
