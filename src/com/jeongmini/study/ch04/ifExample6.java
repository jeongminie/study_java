package com.jeongmini.study.ch04;

import java.util.Scanner;

public class ifExample6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int max = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int min = max;
		
		if(num2 > max) {
			max = num2;
			if(num3 > max) { 
				max = num3;
				}
		} else if(num3 > max) {
			max = num3;
			if(num2 > max) {
				max = num2;
				}
		}
		
		if(num2 < min) {
			min = num2;
			if(num3 < min) { 
				min = num3;
				}
			} else if(num3 < min) {
				min = num3;
			if(num2 < min) {
				min = num2;
				}
		}
		
		System.out.println("최대값 : " + max + " 최소값 : " + min);
		
	}

}
