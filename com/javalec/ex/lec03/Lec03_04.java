package com.javalec.ex.lec03;

public class Lec03_04 {

	public static void main(String[] args) {
				
		char c = 'a';
		System.out.println("c = " + c);
		
		int i = 10;
		System.out.println("i = " + i);
		
		double d = 10.258;
		System.out.println("d = " + d);
		
		boolean b = false;
		System.out.println("b = " + b);
		
		String s = "Hello Java Wrold!!";
		System.out.println("s = " + s);
		
		System.out.println("==========================");
		
		//�ڵ�(������) �� ��ȯ:
		//���� ������ �޸𸮿��� ū ������ �޸𸮷� �̵�
		byte by = 10;
		int in = by;
		System.out.println("in = " + in);
		
		//����� �� ��ȯ:
		//ū ������ �޸𸮿��� ���� ������ �޸𸮷� �̵�
		int iVar = 100;
		byte bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);
		
		iVar = 123456;
		bVar = (byte)iVar;
		System.out.println("bVar = " + bVar);

	}

}
