package com.javalec.ex.lec15_abstract;

public class MainClass {

	public static void main(String[] args) {
		Child1 child1 = new Child1(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		Child2 child2 = new Child2(PriceTable.RICE, PriceTable.BULGOGI, PriceTable.BANANA, PriceTable.MILK, PriceTable.ALMOND);
		
		System.out.println("child1 아이의 식대 : " + child1.calculating());
		System.out.println("child2 아이의 식대 : " + child2.calculating());
	}
}
