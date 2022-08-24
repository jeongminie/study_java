package com.jeongmini.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {
		
		//기본 생성자가 없으면 아래 코드는 에러남 명시적 생성자가 있기때문에 자동으로 생성이 안되기때문이다.
		CarSecond carSecond = new CarSecond();
		String color;
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("white", 3000);
		String color2 = "red";
		
		System.out.println(carSecond2.color);
		System.out.println(carSecond2.cc);
		
		System.out.println(carSecond3.color);
		System.out.println(carSecond3.cc);
		
		

	}

}
