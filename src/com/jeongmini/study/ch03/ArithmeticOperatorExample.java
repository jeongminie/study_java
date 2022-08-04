package com.jeongmini.study.ch03;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

//		int v1= 5;
//		int v2 = 2;
//		
//		int result1 = v1 + v2;
//		System.out.println(result1);
//		
//		int result2 = v1 - v2;
//		System.out.println(result2);
//		
//		int result3 = v1 * v2;
//		System.out.println(result3);
//		
//		int result4 = v1 / v2;
//		System.out.println(result4);
//		
//		int result5 = v1 % v2;
//		System.out.println(result5);
//
//		double result6 = v1 / v2;
//		System.out.println(result6);
//		
//		result6 = (double) v1 / v2;
//		System.out.println(result6);
		
//		double a = 5/3;
//		double b = 5/8;
//		double c = 49/5;
//		
//		double result = (a-b)*c;
//		
//		System.out.println(result);
//		
//		double d = 5;
//		double e = 3.25;
//		double f = 11/6;
//		double g = 12/17;
//		
//		double result2 = d-(e-f)*g;
//		
//		System.out.println(result2);
//		
//		sum(3,3,3);
		
		System.out.println("홍길동 평균 : " + average(60, 70, 85, 90, 45));
		System.out.println(average(50, 75, 70, 60, 70));
		System.out.println(average(55, 60, 64, 58, 90));
		System.out.println(average(80, 70, 63, 88, 78));
	}
//	
//	
//	public static void sum(int a, int b, int c) {
//		System.out.println(a + " + " + b + " + " + c + " = " + (a+b+c));
//	}
	
	public static double average(int a, int b, int c, int d, int e) {
		return (double)(a+b+c+d+e)/5;
		
	}

}
