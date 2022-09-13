package com.spring.consinject;

public class SamsungTV implements TV{

	private SonySpeaker speaker; //ÂüÁ¶ °´Ã¼ º¯¼ö
	
	public SamsungTV(SonySpeaker speaker){
		this.speaker = speaker;
		System.out.println("SamsungTV() °´Ã¼ »ı¼º");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV -- Àü¿ø ÄÒ´Ù");
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV -- Àü¿ø ²ö´Ù");
	}

	@Override
	public void volumeUp() {
		speaker.volumnUp();
	}

	@Override
	public void volumeDown() {
		speaker.volumnDown();
	}

}
