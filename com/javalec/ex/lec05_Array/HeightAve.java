package com.javalec.ex.lec05_Array;

import java.util.Scanner;

public class HeightAve {
	
	public static void main(String[] args) {
		
		String[] iArrName = {"영희", "철수", "길동", "영수", "말자"};
		int[] iArr = new int[iArrName.length];
		int totalHeight = 0;
		int maxH = 0;
		int maxHIndex = 0;
		int minH = 0;
		int minHIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<iArr.length; i++) {
			System.out.print(iArrName[i] + "의 키를 입력하세요 : ");
			iArr[i] = scanner.nextInt();
			totalHeight += iArr[i];
		}
		
		System.out.println("학생들의 평균 신장은 " + (totalHeight/iArr.length) + " 입니다.");
		
		for (int i=0; i<iArr.length; i++) {
			if (iArr[i] > maxH) {
				maxH = iArr[i];
				maxHIndex = i;
			}
		}
		
		minH = maxH;
		for (int i=0; i<iArr.length; i++) {
			if (iArr[i] < minH) {
				minH = iArr[i];
				minHIndex = i;
			}
		}
		
		System.out.println("키가 제일 큰 사람은 " + iArrName[maxHIndex] + "이며, 키는 " + maxH + "입니다.");
		System.out.println("키가 제일 작은 사람은 " + iArrName[minHIndex] + "이며, 키는 " + minH + "입니다.");
	}

}
