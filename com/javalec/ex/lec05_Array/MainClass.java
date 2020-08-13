package com.javalec.ex.lec05_Array;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		int[] iArr = {10, 20, 30, 40, 50};
		
		for (int i : iArr) {
			System.out.println(i);
		}
		
		int i = 0;
		while (i < iArr.length) {
			System.out.println("iArr[" + i + "] = " + iArr[i]);
			i++;
		}
		
		int[] jArr = new int[3];
		jArr[0] = 0;
		jArr[1] = 1;
		jArr[2] = 2;
		
		System.out.println(jArr);
		
		//레퍼런스의 이해
		int[] iArr1 = {10, 20, 30, 40, 50};
		int[] iArr2 = iArr1;
		
		for (int j=0; j<iArr1.length; j++) {
			System.out.println("iArr1[" + j + "] = " + iArr1[j]);
		}
		
		iArr2[0] = 100;
		iArr2[1] = 200;
		iArr2[2] = 300;
		iArr2[3] = 400;
		iArr2[4] = 500;
		
		for (int j=0; j<iArr1.length; j++) {
			System.out.println("iArr1[" + j + "] = " + iArr1[j]);
			System.out.println("iArr2[" + j + "] = " + iArr2[j]);
		}
	}
}
