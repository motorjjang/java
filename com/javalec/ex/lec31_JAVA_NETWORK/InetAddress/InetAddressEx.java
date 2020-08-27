package com.javalec.ex.lec31_JAVA_NETWORK.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressEx {

	Scanner scanner;
	
	public InetAddressEx() {
		// TODO Auto-generated constructor stub
		System.out.print("Host 이름을 입력 하세요 : ");
		
		scanner = new Scanner(System.in);
		
		try {
			InetAddress inetAddress = InetAddress.getByName(scanner.next());
			//InetAddress inetAddress2 = InetAddress.getByName("naver.com");
			
			System.out.println("Computer NAME : " + inetAddress.getHostName());
			System.out.println("Computer IP : " + inetAddress.getHostAddress());			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
