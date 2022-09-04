package com.jeongmini.study.ch07.forth;

import java.util.Arrays;

public class Parents {
	
	int sum = 0;
	
	public void sortASC(int arr[]) {
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int arithmetic(int arr[]) {
		System.out.println("Parents 클래스 실행");
		
		sum = arr[0] * arr[1] + arr[2];
		
		return sum;
	}
}
