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
		
		InputStream is2 = null;
		OutputStream os2 = null;		
		
		byte[] buffer = new byte[1024*8];
		
		try {
			is = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain.txt");
			os = new FileOutputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain_copy.txt");
			
			while(true) {
				int i = is.read();
				if(i == -1) break;
				os.write(i);
			}
			
			is2 = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain.txt");
			os2 = new FileOutputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain_copy2.txt");
			
			while(true) {
				int count = is2.read(buffer);
				System.out.println("COUNT : " + count);
				if(count == -1) {
					System.out.println("더이상 읽을 데이터가 없습니다.");
					break;
				}
				os2.write(buffer, 0, count);
			}
			
			is2.close();
			os2.close();
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
