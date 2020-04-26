package com.javalec.ex.lec28_IO.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\28_OutputStream_test.txt");
			String str = "오늘 날씨는 아주 좋습니다. 정말 좋습니다.";
			byte[] bs = str.getBytes();
			os.write(bs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(os != null) os.close();	
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
}
