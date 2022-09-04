package com.jeongmini.study.ch07.sixth;

public class Cat extends Animal {
	
	//생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	//Animal 추상 클래스를 상속 받았으므로 꼭 구현해야함 
	@Override
	public void sound() {
		System.out.println("야옹");
	}

	@Override
	public void sound(String m) {
		System.out.println("야옹" + m);
	}
	
	

}
