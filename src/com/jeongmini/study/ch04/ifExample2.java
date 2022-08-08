package com.jeongmini.study.ch04;

import java.util.Scanner;

public class ifExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("등급 : ");
		String grade = scan.next();
		
		System.out.print("가격 : ");
		int price = scan.nextInt();
		
		double sale;

		switch(grade) {
			case ("일반") :
				sale = price * 0.05;
				System.out.println("정가 : " + (price-sale));
				break;
			case ("브론즈") :
				sale = price * 0.1;
				System.out.println("정가 : " + (price-sale));
				break;
			case ("실버") :
				sale = price * 0.15;
				System.out.println("정가 : " + (price-sale));
				break;
			case ("플래티넘") :
				sale = price * 0.2;
				System.out.println("정가 : " + (price-sale));
				break;
			case ("골드") :
				sale = price * 0.27;
				System.out.println("정가 : " + (price-sale));
				break;
		}
		
	}

}
