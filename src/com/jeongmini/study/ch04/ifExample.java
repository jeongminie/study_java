package com.jeongmini.study.ch04;

public class ifExample {

	public static void main(String[] args) {
		
		int score = 67;

		if(score >= 90) {
			if(score >= 97) {
				System.out.println("A+"); 
				return;
			} else if(score <= 92) {
				System.out.println("A-");
				return;
			}
			System.out.println("A");
		} else if(score >= 80){
			if(score >= 87) {
				System.out.println("B+"); 
				return;
			} else if(score <= 82) {
				System.out.println("B-");
				return;
			}
			System.out.println("B");
		} else if(score >= 70) {
			if(score >= 77) {
				System.out.println("C+"); 
				return;
			} else if(score <= 72) {
				System.out.println("C-");
				return;
			}
			System.out.println("C");
		} else if(score >= 60) {
			if(score >= 67) {
				System.out.println("D+"); 
				return;
			} else if(score <= 62) {
				System.out.println("D-");
				return;
			}
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
/* 97 ++ 92이하 - */