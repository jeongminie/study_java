package com.jeongmini.study.ch04;

public class MultiplicationTable {

	public static void main(String[] args) {

		//2단 출력
		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println("2 * " + i + " = " + (2*i));
//		}
		
		//2단 부터 9단까지
		
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}

	}

}
