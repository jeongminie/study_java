package com.jeongmini.study.ch04;

import java.util.Random;

public class RandomSum2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int num1 = rand.nextInt(100);
		int num2 = rand.nextInt(100);
	
		int min = 0;
		int max = 0;
		
		int sum = 0;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		}
		
		for(int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		
		System.out.println(min + " ~ " + max + " 사이의 총 합은 " + sum + " 입니다.");
		
	}
		
}
