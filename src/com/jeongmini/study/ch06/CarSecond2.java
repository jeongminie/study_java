package com.jeongmini.study.ch06;

public class CarSecond2 {
	
	String model = "아반떼";
	String color = "Red";
	int cc = 1500;
	
	//명시적 생성자,
	//오버로드
	//함수 이름은 똑같지만 안에 매겨변수 위치와 갯수가 틀린 것.
	CarSecond2(String model) {
		this.model = model;
	}
	
	CarSecond2(String model, int cc) {
		this.model = model;
		this.cc = cc;
	}
	
	CarSecond2(int num, String model) {
		this.model = model;
		this.cc = num;
	}
	
	CarSecond2(String model, int cc, String color) {
		this.model = model;
		this.cc = cc;
		this.color = color;
	}
	
	//기본생성자
	CarSecond2(){
		
	}
	
	public void say() {
		System.out.println(model + " " + cc + " " + color);
	}


}
