package com.javalec.ex.lec27_collection.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("array0");
		arrayList.add("array1");
		arrayList.add("array2");
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());			
		}
		
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(0, "atr0");
		hashMap.put(1, "atr1");
		hashMap.put(2, "atr2");
		hashMap.put(3, "atr3");
		hashMap.put(4, "atr4");
		System.out.println(hashMap.toString());
		
		Set<Integer> set = hashMap.keySet();
		Iterator<Integer> iterator2 = set.iterator();
		while(iterator2.hasNext()) {
			System.out.println(hashMap.get(iterator2.next()));
		}
	}	
}
