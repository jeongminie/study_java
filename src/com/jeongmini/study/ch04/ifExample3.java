package com.jeongmini.study.ch04;

import java.util.Scanner;

public class ifExample3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1 + " 더 큽니다.");
		} else if(num1 < num2) {
			System.out.println(num2 + " 더 큽니다.");
		} else {
			System.out.println("두 수는 같습니다.");
		}
	}

}
