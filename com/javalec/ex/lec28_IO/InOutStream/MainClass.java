package com.javalec.ex.lec28_IO.InOutStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) throws IOException {
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain.txt");
			os = new FileOutputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain_copy.txt");
			
			while(true) {
				int i = is.read();
				if(i == -1) break;
				os.write(i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				is.close();
			}
			
			if (os != null) {
				os.close();
			}
		}
		
	}
}
