package com.jeongmini.study.ch06;

public class HyundaiMotorsExample {

	public static void main(String[] args) {

		HyundaiMotors hyundaiMotors = new HyundaiMotors();
		
		for(int i = 0; i < hyundaiMotors.name.length; i++) {
			System.out.println(hyundaiMotors.name[i]);
		}
		
		//사용
		int result = hyundaiMotors.sum(1, 2);
		System.out.println("sum : " + result);

	}

}
