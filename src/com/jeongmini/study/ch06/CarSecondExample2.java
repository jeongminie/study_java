package com.jeongmini.study.ch06;

public class CarSecondExample2 {

	public static void main(String[] args) {
		
		CarSecond2 car = new CarSecond2("제네시스");
		car.say();
		
		CarSecond2 car2 = new CarSecond2("제네시스", 3000);
		car2.say();
		
		CarSecond2 car3 = new CarSecond2("제네시스", 3000, "blue");
		car3.say();

	}

}
