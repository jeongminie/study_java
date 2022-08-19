package com.jeongmini.study.ch04;

public class ForExample {

	public static void main(String[] args) {
		
		//1번
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		
		//2번		
//		for(int i = 1; i <= 5; i ++) {
//			if(i == 1 || i == 5) {
//				System.out.print("**********");
//			} else {
//				for(int j = 1; j <= 10; j++) {
//					if(j == 1 || j == 10) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		
		//2번		
		for(int i = 1; i <= 5; i ++) {
			for(int j = 1; j <= 10; j++) {
				if(i == 1 || i ==5) {
					System.out.print("*");
				} else if(j == 1 || j == 10) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		//3번
		for(int i = 1; i <= 10; i ++) {
			for(int j = 1; j <= i; j++) {
				if(i != 10) {
					System.out.print(j);
				} else { 
					if (j == 10) {
						System.out.print(0);
					} else if(j % 2 != 0) { //홀수면
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}
