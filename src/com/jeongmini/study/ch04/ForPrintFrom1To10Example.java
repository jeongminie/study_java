package com.jeongmini.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		//1부터 10까지 더 하는 프로그램 작성
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println("합계 : " + sum);

	}

}
