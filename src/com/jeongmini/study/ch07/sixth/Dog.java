package com.jeongmini.study.ch07.sixth;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	@Override
	public void sound(String m) {
		// TODO Auto-generated method stub
		
	}
	
	
}
