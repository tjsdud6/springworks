package com.spring.setterinject;


public interface TV {
	
	public void powerOn();
	public void powerOff();
	public void volumeUp();
	public void volumeDown();
	
	
	/*
	 결합도를 약간 낮춤 (코드 수정을 조금 적게 할 수 있음)
	 모든 TV 클래스가 같은 메소드들을 가질 수 밖에 없도록 강제 할 수 있음
	*/
}
