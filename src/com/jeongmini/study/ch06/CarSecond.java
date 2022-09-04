package com.jeongmini.study.ch06;

public class CarSecond {
	
	String color = "Red";
	int cc = 1500;
	
	//명시적 생성자
	CarSecond(String str) {
		this.color = str;
	}
	
	CarSecond(String str, int num) {
		this.color = str;
		this.cc = num;
	}
	
	//기본생성자
	CarSecond(){
		
	}


}
