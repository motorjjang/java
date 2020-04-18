package com.javalec.ex.lec11.staticex;

import java.util.Scanner;

import com.javalec.ex.lec11.children.FirstChild;
import com.javalec.ex.lec11.children.SecondChild;
import com.javalec.ex.lec11.children.ThirdChild;
import com.javalec.ex.lec11.father.FatherWallet;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner inputMoney = new Scanner(System.in);
		
		System.out.print("ù°�� ������ ���� �Է��Ͻÿ� : ");
		int firstChildMoney = inputMoney.nextInt();
		FirstChild firstChild = new FirstChild();
		firstChild.takeMoney(firstChildMoney);
		
		System.out.print("\n��°�� ������ ���� �Է��Ͻÿ� : ");
		int secondChildMoney = inputMoney.nextInt();
		SecondChild secondChild = new SecondChild();
		secondChild.takeMoney(secondChildMoney);
		
		System.out.print("\n��°�� ������ ���� �Է��Ͻÿ� : ");
		int thirdChildMoney = inputMoney.nextInt();
		ThirdChild thirdChild = new ThirdChild();
		thirdChild.takeMoney(thirdChildMoney);
		
		inputMoney.close();
		
		System.out.println("\n���� �ƺ� �ڰ��� ���� �� : " + FatherWallet.MONEY);
	}
}
