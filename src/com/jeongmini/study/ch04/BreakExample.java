package com.jeongmini.study.ch04;

public class BreakExample {

	public static void main(String[] args) {

		double min = 1.0;
		double max = 10.0;
		
		while(true) {
			int random = (int) ((Math.random() * (max - min)) + min);
			
			System.out.println(random);
			
			if(random == 5) {
				break;
			}
			
		}
		
		System.out.println("---------------");
		
		for(int i = 1; i <= 10; i ++) {
			int random = (int) ((Math.random() * (max - min)) + min);
			System.out.println(i + " : " + random);;
			if(random == 5) {
				break;
			}
		}
		
		System.out.println("---------------");
		
		aa:
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				int random = (int) ((Math.random() * (max - min)) + min);
				System.out.println(i + " : " + j + " : " + random);;
				if(random == 5) {
					break aa;
				}
				
			}
		}

	}

}
