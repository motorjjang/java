package com.javalec.ex.lec28_IO.InOutStream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain.txt");
			os = new FileOutputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain_copy2.txt");
			byte[] bs = new byte[5];
			
			while(true) {
				int count = is.read(bs);
				if (count == -1) break;
				
				os.write(bs, 0, count);
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
			}
			
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
