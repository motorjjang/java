package com.javalec.ex.lec28_IO.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\27_Iterator.txt");
			while (true) {
				int i = is.read();
				System.out.println("데이터 : " + i);
				if(i == -1) break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
