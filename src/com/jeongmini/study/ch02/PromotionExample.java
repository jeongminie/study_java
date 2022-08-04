package com.jeongmini.study.ch02;

public class PromotionExample {
	
	public static void main(String[] args) {
		
//		작은 형이 큰 형으로 변환은 문제가 발생하지 않는다.
//		큰 형이 작은 형으로 변환이 되려면 문제가 생기거나 변환이 이루어져도 데이터 손실 발생
//		byte -> short -> int -> long -> float -> double 
		
		  byte byteVal = 10; 
		  System.out.println("byteValue : " + byteVal);
		  
		  int intValue = byteVal; 
		  System.out.println("intValue : " + intValue);
		  
		  intValue = 200; 
		  System.out.println(intValue);
		  
		  double doubleValue = intValue; 
		  System.out.println(doubleValue);

		short shortVal = 10;

		
	}

}
