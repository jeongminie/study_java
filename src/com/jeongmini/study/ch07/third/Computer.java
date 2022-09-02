package com.jeongmini.study.ch07.third;

public class Computer extends Calculator {

	// source -> override ~ 기능 사용
//	@Override
//	public double areaCircle(double r) {
//		return super.areaCircle(r);
//	}
	
	//함수 첫줄은 똑같아야 함
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		
		return Math.PI * r * r;
	}
	
}
