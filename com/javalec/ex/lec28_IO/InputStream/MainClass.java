package com.javalec.ex.lec28_IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain.txt");
			String s = "";
			while(true) {
				int i = is.read();				 
				s += (char)i;				
				System.out.println("데이터 : " + i);
				if (i == -1) {
					break;
				}
			}
			System.out.println(s);
			is.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/* InputStream 사용법
 * 1) InputStream (추상)클래스를 이용해서 객체를 만든다. 또는 다른 클래스의 메소드에서
 *    반환(리턴)되는 타입 객체를 얻는다.
 * 2) read()메소드를 이용해서 데이터를 읽으면 됩니다.
 * 3) read(), read(byte[]) 두개의 메소드를 이용할 수 있습니다.
 * */