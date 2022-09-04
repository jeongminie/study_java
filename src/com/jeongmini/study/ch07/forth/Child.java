package com.jeongmini.study.ch07.forth;

public class Child extends Parents{
	
	int sum = 0;
	
	@Override
	public int arithmetic(int arr[]) {
		System.out.println("Child 클래스 실행");
		sum = arr[0] * arr[1] + arr[2] + 10;
		
		return sum;
	}
}
