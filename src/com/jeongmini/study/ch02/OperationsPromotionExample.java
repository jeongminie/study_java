package com.jeongmini.study.ch02;

public class OperationsPromotionExample {

	public static void main(String[] args) {

		byte byteValue = 12;
		byte byteValue2 = 12;
//		byte byteValue3 = (byte) (byteValue + byteValue2);
		int intSum = byteValue + byteValue2;
		System.out.println(intSum);
		
		short shortValue = 12;
		short shortValue2 = 12;
		intSum = shortValue + shortValue2;
		System.out.println(intSum);
		
		int intValue = 12;
		int intValue2 = 12;
		int intValue3 = intValue + intValue2;
		System.out.println(intValue3);
		
		long longValue = 12;
		long longValue2 = 12;
		long longValue3 = longValue + longValue2;
		System.out.println(longValue3);
		
		float floatValue = 12;
		float floatValue2 = 12;
		float floatValue3 = floatValue + floatValue2;
		System.out.println(floatValue3);
		
		double doubleValue = 12.0;
		double doubleValue2 =12.0;
		double doubleValue3 = doubleValue + doubleValue2;
		System.out.println(doubleValue3);
		
//		byte byteValue4 = byteValue + intValue; <-- 에러
		int intValue4 = byteValue + intValue;
		System.out.println(intValue4);
		
//		int intValue5 = intValue + doubleValue; <-- 에러
		double doubleValue4 = intValue + doubleValue;
		System.out.println(doubleValue4);

	}

}
