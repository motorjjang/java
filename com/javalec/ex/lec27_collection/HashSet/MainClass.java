package com.javalec.ex.lec27_collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("str0");
		hashSet.add("str1");
		hashSet.add("str2");
		hashSet.add("str3");
		hashSet.add("str2");
		System.out.println(hashSet.toString());
		
		hashSet.remove("str0");
		System.out.println(hashSet.toString());
		
		int i = hashSet.size();
		System.out.println("size : " + i);
		
		System.out.println();
		
		Iterator iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
