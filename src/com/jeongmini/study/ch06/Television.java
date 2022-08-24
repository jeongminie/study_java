package com.jeongmini.study.ch06;

public class Television {
	
	public static String campany = "Samsung";
	public static String model = "OLED";
	public static String info;
	
	//static으로 선언된 필드를 이용해서 조립하고 싶을때 static 블럭을 사용
	static {
		info = campany + " " + model;
				
	}
}
