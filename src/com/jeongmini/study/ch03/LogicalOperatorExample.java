package com.jeongmini.study.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int a= 65;
		
		boolean result = a >= 65;
		System.out.println(result);
		
		result = a <= 90;
		System.out.println(result);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		} 
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		//f f
		if(a > 65 ^ a < 50) {
			System.out.println("둘다 거짓");
		}
		
		//t t
		if(a >= 65 ^ a <= 90) {
			System.out.println("둘다 참");
		}
		//f t
		if(a >= 65 ^ a < 50) {
			System.out.println("거짓 참");
		}
		
		//t f
		if(a > 65 ^ a <= 90) {
			System.out.println("참 거짓");
		}
	}

}
