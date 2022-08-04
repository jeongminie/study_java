package com.jeongmini.study.ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		boolean result = (a == b);
		
		System.out.println(result);
		
		result = a != b;
		System.out.println(result);
		
		result = a < b;
		System.out.println(result);
		
		result = a <= b;
		System.out.println(result); 

		result = a > b;
		System.out.println(result);
		
		result = a >= b;
		System.out.println(result);
	}

}
