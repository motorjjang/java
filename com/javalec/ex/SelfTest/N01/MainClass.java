package com.javalec.ex.SelfTest.N01;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass {

	public static void main(String[] args) {
		VO vo1 = new VO(1, 2, "test1", "test2");
		VO vo2 = new VO(10, 20, "테스트1", "테스트2");
		
		System.out.println(vo2.getI() + " " + vo2.getJ() + " " + vo2.getS1() + " " + vo2.getS2());
		
		ArrayList<VO> al1 = new ArrayList<VO>();
		al1.add(vo1);
		al1.add(vo2);
		System.out.println(al1.get(0).getI());
		
		HashMap<String, VO> map1 = new HashMap<String, VO>();
		map1.put("a", vo1);
		System.out.println(map1.get("a").getS1());
		
	}
}
