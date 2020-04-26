package com.javalec.ex.lec26_collection.LinkedList;

import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("str0");
		linkedList.add("Str1");
		linkedList.add("str2");
		linkedList.add("str3");
		System.out.println(linkedList);
		System.out.println(linkedList.toString());
		
		linkedList.add("str4");
		System.out.println(linkedList.toString());
		
		linkedList.add(2, "STR2");
		System.out.println(linkedList.toString());
		
		int size = linkedList.size();
		System.out.println("size : " + size);
		
		linkedList.remove(2);
		System.out.println(linkedList.toString());
		
		linkedList.clear();
		System.out.println(linkedList.toString());
		
		linkedList = null;
		System.out.println(linkedList);
		
		/*
		--LinkedList
		ArrayList와 거의 비슷합니다.
		
		--Vector
		ArrayList와 비슷하지만 속도가 떨어집니다. 하지만, ArrayList보다 멀티스레드 환경에서는 안전하여, 여전히 많이 쓰이고 있습니다.
		 * */
	}
}
