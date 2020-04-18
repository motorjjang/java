package com.javalec.ex;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		System.out.println("arrAtt1.lentgh : " + arrAtt1.length);
		
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		arrAtt3[0] = 5;
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
		System.out.println();
		
		// 다차원 배열
		int[][]  arrMul  = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;
		
		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));
	}
}
