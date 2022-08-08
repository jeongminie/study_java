package com.jeongmini.study.ch03;

public class ConditionalOperatorExample {

	public static void main(String[] args) {

		int score = 85;
		
		char grade = score > 90 ? 'A' : 'B';
		
		System.out.println(grade);
		
		if(grade > 90) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

	}

}
