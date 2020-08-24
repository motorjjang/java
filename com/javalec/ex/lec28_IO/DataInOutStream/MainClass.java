package com.javalec.ex.lec28_IO.DataInOutStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MainClass {

	public static void main(String[] args) {
		
		InputStream is = null;
		DataInputStream dis = null;
		
		OutputStream os = null;
		DataOutputStream dos = null;
		
		try {
			is = new FileInputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain.txt");
			dis = new DataInputStream(is);
			String str = dis.readUTF();
			
			os = new FileOutputStream("D:\\git\\eclipse-workspace\\testex\\src\\com\\javalec\\ex\\memo\\jain_copy3.txt");
			dos = new DataOutputStream(os);
			dos.writeUTF(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(dos!=null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(os != null) {
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
