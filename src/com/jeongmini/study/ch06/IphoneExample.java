package com.jeongmini.study.ch06;

public class IphoneExample {

	public static void main(String[] args) {

		//객체화
		Iphone iphone = new Iphone(); 
		Car car = new Car();
		
		//phoneModel, name 인스턴스화
		System.out.println(iphone.phoneModel); 
		System.out.println(car.getName());
		
		//메소드 호출
		iphone.pr();
		
		Bag bag = new Bag();
		
		System.out.println(bag.name);
		
//		다른클래스가 내용을 수정하지 못하도록 해야함 -> private
//		car.name = "아반떼"; 
		car.setName("아반떼");
		System.out.println(car.getName());
		

	}

}
