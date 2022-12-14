package com.spring.annotation;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{

	public AppleSpeaker() {
		System.out.println("==> AppleSpeaker() 按眉积己");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker -- 家府 虐框");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker -- 家府 临烙");
	}
 
}
