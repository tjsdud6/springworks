package com.spring.ploymorphism;

public class TVUser {

	public static void main(String[] args) {
		/* TV tv = new SamsungTV(); */
		TV tv = new LgTV();
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		/*
		 �������̽��� ��ü(�ν��Ͻ�) �����ؼ� ������ ����ȯ(�ڵ�����ȯ)��
		 �̿��Ͽ� ��ü�� �����ϸ� ���� ��ü ���� 
		  
		 */
	}
}
