package com.javalec.ex.lec26_collection.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");
		System.out.println(arrayList.toString());
		System.out.println(arrayList);
		
		for (String s : arrayList) {
			System.out.println(s);
		}
		
		String index3 = arrayList.get(3);
		System.out.println("index3 = " + index3);
		
		arrayList.set(1,  "str22222");
		System.out.println(arrayList.toString());
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		System.out.println(arrayList.size());
		
		arrayList = null;
		System.out.println(arrayList);
		//System.out.println(arrayList.size());
		
		ArrayList<Integer> intArrayList = new ArrayList<Integer>();
		intArrayList.add(1);
		intArrayList.add(2);
		System.out.println(intArrayList);
		for (int i : intArrayList) {
			System.out.println(i);
		}
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("index0");
		linkedList.add("index1");
		linkedList.add("index2");
				
		for (String s : linkedList) {
			System.out.println(s);
		}
	}
}
