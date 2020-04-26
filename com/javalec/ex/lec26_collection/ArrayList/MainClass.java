package com.javalec.ex.lec26_collection.ArrayList;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList.toString());
		
		String index3 = arrayList.get(3);
		System.out.println("index3 = " + index3);
		
		arrayList.set(2, "str2222222");
		System.out.println(arrayList.toString());
		
		int size = arrayList.size();
		System.out.println("size : " + size);
		
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		System.out.println("index2 = " + arrayList.get(2));
		System.out.println(arrayList);
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		
		arrayList = null;

		System.out.println(arrayList);
		
		try {
			System.out.println(arrayList.toString());
			System.out.println(arrayList.size());	
		} catch(Exception e) {
		//	System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("The End");
	}
}
