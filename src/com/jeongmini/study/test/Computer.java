package com.jeongmini.study.test;

public class Computer extends Culculator {

	@Override
	public double area(double r) {
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		
		return Constants.PAI_2 * (r*r);
	}

}
