package com.javalec.ex.lec27_collection.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(0);
		arrayList2.add(1);
		System.out.println(arrayList2.toString());
		
		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		System.out.println();
		
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "atr0");
		hashMap.put(1, "atr1");
		hashMap.put(2, "atr2");
		hashMap.put(3, "atr3");
		hashMap.put(4, "atr4");
		System.out.println("hashMap : " + hashMap.toString());
		
		Set<Integer> set = hashMap.keySet();
		System.out.println("key set : " + set.toString());
		
		Iterator<Integer> iterator2 = set.iterator();
		
		while (iterator2.hasNext()) {
			Integer key = iterator2.next();
			System.out.println(key + " : " + hashMap.get(key));
		}
	}	
}
