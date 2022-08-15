package com.jeongmini.study.ch04;

import java.util.Scanner;

public class ifExample4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("제 1사분면");
		} else if(num1 < 0 && num2 > 0) {
			System.out.println("제 2사분면");
		} else if(num1 < 0 && num2 < 0) {
			System.out.println("제 3사분면");
		} else {
			System.out.println("제 4사분면");
		}
	}

}
