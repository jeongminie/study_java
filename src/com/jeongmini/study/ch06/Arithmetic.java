package com.jeongmini.study.ch06;

public class Arithmetic {
	
	//명시적으로 생성자 존재하지 않음

	public int plus(int a, int b) {
		
		return a + b;
	}
	
	public int minus(int a, int b) {
		 
		return a - b;
	}
	
	public int multi(int a, int b) {
		
		return a * b;
	}
	
	public int divi(int a, int b) {
		
		return a / b;
	}
	
	public void say(int result) {
		System.out.println("result : " + result);
	}
	
	public String test(int a) {
		return "";
	}
	
	static void staticTest() {
		System.out.println("static 테스트 입니둥");
	}

}
