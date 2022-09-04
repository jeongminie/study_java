package com.jeongmini.study.ch07.sixth;

public abstract class Animal {
	
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//abstract 메서드는 abstract 클래스 내에서만 가능!
	public abstract void sound();
	public abstract void sound(String m);
}
