package com.javalec.ex.lec11.staticex;

import java.util.Scanner;

import com.javalec.ex.lec11.children.FirstChild;
import com.javalec.ex.lec11.children.SecondChild;
import com.javalec.ex.lec11.children.ThirdChild;
import com.javalec.ex.lec11.father.FatherWallet;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner inputMoney = new Scanner(System.in);
		
		System.out.print("첫째가 가져갈 돈을 입력하시오 : ");
		int firstChildMoney = inputMoney.nextInt();
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(firstChildMoney);
		
		System.out.print("\n둘째가 가져갈 돈을 입력하시오 : ");
		int secondChildMoney = inputMoney.nextInt();
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(secondChildMoney);
		
		System.out.print("\n셋째가 가져갈 돈을 입력하시오 : ");
		int thirdChildMoney = inputMoney.nextInt();
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(thirdChildMoney);
		
		inputMoney.close();
		
		System.out.println("\n현재 아빠 자갑에 남은 돈 : " + FatherWallet.MONEY);
	}
}
