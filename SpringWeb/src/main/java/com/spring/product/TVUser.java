package com.spring.product;

public class TVUser {

	public static void main(String[] args) {
		
		/*SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.voluemUp();
		tv.voluemDown();
		tv.powerOff();*/
		
		LgTV tv = new LgTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}

}
