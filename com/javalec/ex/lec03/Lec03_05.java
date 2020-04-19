package com.javalec.ex.lec03;

public class Lec03_05 {

	public static void main(String[] args) {
		// �ּ�
		/*
		 * �����Ϸ��� ���������� �ʽ��ϴ�.
		 */
		
		// Ư������
		System.out.println("Good\tMorning~");   // \t
		System.out.println("Good\nMorning~");	// \n
		System.out.println("Good\'Morning~\'"); // \'
		System.out.println("Good\"Morning~\""); // \"
		System.out.println("Good\\Morning~\\"); // \\
		
		System.out.println("=================================");
		
		// ���Ĺ���
		System.out.println("������ ����� 10�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", 10);
		
		int num1 = 20;
		System.out.println("������ ����� " + num1 +"�� �Դϴ�.");
		System.out.printf("������ ����� %d�� �Դϴ�.\n", num1);
		
		System.out.printf("ȫ�浿's Info. : %d�г� %d�� %d��\n", 6, 2, 10);
		
		// ����
		int num2 = 30;
		System.out.printf("num2(10����) : %d\n", num2);
		System.out.printf("num2(8����) : %o\n", num2);
		System.out.printf("num2(16����) : %x\n", num2);
		
		// ����
		System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", 'a', 'B');
		
		// ���ڿ�
		System.out.printf("\'%s\'�� �빮�ڷ� �ٲٸ� \'%s\'�Դϴ�.\n", "java", "JAVA");
		
		// �Ǽ�
		float f = 1.23f;
		System.out.printf("f = %f\n", f);
		
		double d = 1.23456d;
		System.out.printf("d = %f\n", d);
		
		System.out.println("=================================");
		
		// ���Ĺ��� ���� ���
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		// ���Ĺ��� �Ҽ������� ���
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);

	}

}
