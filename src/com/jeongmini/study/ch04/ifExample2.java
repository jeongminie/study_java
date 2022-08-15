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
		
		if(grade.equals("일반")) {
			sale = price * 0.05;
			System.out.println("할인가 : " + (int)(price-sale));
		} else if (grade.equals("브론즈")) {
			sale = price * 0.1;
			System.out.println("할인가 : " + (int)(price-sale));
		} else if(grade.equals("실버")) {
			sale = price * 0.15;
			System.out.println("할인가 : " + (int)(price-sale));
		} else if(grade.equals("플래티넘")) {
			sale = price * 0.2;
			System.out.println("할인가 : " + (int)(price-sale));
		} else {
			sale = price * 0.27;
			System.out.println("할인가 : " + (int)(price-sale));
		}
		
		switch(grade) {
			case"일반":
				sale = price * 0.05;
				System.out.println("할인가 : " + (int)(price-sale));
				break;
			case"브론즈":
				sale = price * 0.1;
				System.out.println("할인가 : " + (int)(price-sale));
				break;
			case"실버":
				sale = price * 0.15;
				System.out.println("할인가 : " + (int)(price-sale));
				break;
			case"플래티넘":
				sale = price * 0.2;
				System.out.println("할인가 : " + (int)(price-sale));
				break;
			case"골드":
				sale = price * 0.027;
				System.out.println("할인가 : " + (int)(price-sale));
				break;
			default:
				System.out.println("해당하는 등급이 없습니다.");
				break;
		}
	}
}
