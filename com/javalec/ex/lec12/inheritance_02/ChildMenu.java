package com.javalec.ex.lec12.inheritance_02;

public class ChildMenu extends ParentMenu {

	public ChildMenu() {
		System.out.println("�ڽ� Ŭ����");
	}
	
	public void makeBeefChungGukJang() {
		System.out.println("���� û����");
	}
	
	public void makeHotDoenJangGuk() {
		System.out.println("��ū ���屹");
	}
	
	public void makeKongNaMool() {
		System.out.println("�ᳪ����");
	}
	
	@Override
	public void makeChungGukJang() {
		System.out.println("�������� û����");
	}
	
	@Override
	public void makeGalbiJjim() {
		// TODO Auto-generated method stub
		super.makeGalbiJjim();
		System.out.println("������ �������̵�");
	}
}
