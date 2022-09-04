package com.jeongmini.study.ch07.fifth;

public class SmartPhoneExample {

	public static void main(String[] args) {
		
//		abstract class는 객체 생성 불가능
//		Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("admin");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();

	}

}
