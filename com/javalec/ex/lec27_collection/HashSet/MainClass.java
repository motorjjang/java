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
		
		HashSet<Integer> hashSetInt = new HashSet<Integer>();
		for (int c = 0; c < 10; c++) {
			hashSetInt.add(c);
		}
		
		//hashSetInt.remove(1);
		
		System.out.println(hashSetInt.size());
		System.out.println(hashSetInt.toString());
		
		for (int c : hashSetInt) {
			//hashSetInt.remove(1);
			System.out.println(c);
			//hashSetInt.remove(c);
			//System.out.println(hashSetInt.toString());
		}
		
//		Iterator iterator2 = hashSetInt.iterator();
//		while(iterator2.hasNext()) {
//			hashSetInt.remove((int)iterator2.next());
//		}
	}
}
