package com.jeongmini.study.test;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("원의 반지름 : ");
		int radius = scan.nextInt();
		
		System.out.println();
		
		Culculator culculator = new Culculator();
		Computer computer = new Computer();
		
		double result = culculator.area(radius);
		System.out.println("원 면적: " + result);
		
		System.out.println();
 
		double result2 = computer.area(radius);
		System.out.println("원 면적: " + result2);

	}

}
