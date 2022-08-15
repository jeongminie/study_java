package com.jeongmini.study.ch04;

import java.util.Scanner;

public class ifExample5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}

}
