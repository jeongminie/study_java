package com.jeongmini.study.ch05;

public class EnumWeekExample {

	public static void main(String[] args) {

		Week week; //하나의 데이터타입이 됨
		week = Week.MONDAY;
		
		System.out.println(Week.FRIDAY);
		System.out.println(week);
		
		String nm = week.name(); //string형으로 변환
		System.out.println("name : " + nm);
		
		int ordinal = week.ordinal(); //int형으로 변환
		//monday index가 0
		System.out.println("ordinal : " + ordinal);
		
		Week week2 = Week.THURSDAY;
		
		int result1 = week.compareTo(week2);
		int result2 = week2.compareTo(week);
		
		//문자 위치 인덱스 차이 출력
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		//향상된 for문
		Week[] days = Week.values();
		
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
