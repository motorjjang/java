package com.javalec.ex.lec27_collection.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		System.out.println(hashMap);
		System.out.println(hashMap.toString());
		
		String str = hashMap.get(2);
		System.out.println(str);
		
		hashMap.remove(2);
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		System.out.println(hashMap);
		System.out.println(hashMap.toString());
		
		hashMap.put(0, "str0");
		hashMap.put(1, "str1");
		hashMap.put(2, "str2");
		hashMap.put(3, "str3");
		System.out.println(hashMap.toString());
		System.out.println(hashMap.keySet());
		
		for (int i : hashMap.keySet()) {
			System.out.println(hashMap.get(i));
		}
		
		Iterator<Integer> iterator = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
		
		HashMap<String, String> test01 = new HashMap<String, String>();
		test01.put("a", "test0");
		test01.put("b", "test1");
		test01.put("c", "test2");
		
		for (String s : test01.keySet()) {
			System.out.println(test01.get(s));
		}
		
		Iterator<String> iterator2 = test01.keySet().iterator();
		while(iterator2.hasNext()) {
			System.out.println(test01.get(iterator2.next()));
		}
		
		HashSet<Integer> number = new HashSet<Integer>();
		for (int i=0; i<4; i++) {
			number.add(i);
		}
		System.out.println(number);
	}
}
