package com.jeongmini.study.ch06;

public class Arithmetic {
	
<<<<<<< HEAD
	int sum = 0;
	int sub = 0;
	int mul = 0;
	double div = 0;
	
	public int addition(int a, int b) {
		sum = a + b;
		
		return sum;
	}
	
	public int subtraction(int a, int b) {
		sub = a - b;
		
		return sub;
	}
	
	public int multiplication(int a, int b) {
		mul = a * b;
		
		return mul;
	}
	
	public double division(int a, int b) {
		div = (double)a / b;
		
		return div;
	}
	
	 void additionPrint() {
		System.out.println("합 : " + sum);
	}
	
	public void subtractionPrint() {
		System.out.println("뺴기 : " + sub);
	}
	
	public void multiplicationPrint() {
		System.out.println("곱하기 : " + mul);
	}
	
	public void divisionPrint() {
		System.out.println("나누기 : " + div);
	}
	
	public void word(String word1, String word2) {
		System.out.println(word1 + " " + word2);
=======
	//명시적으로 생성자 존재하지 않음

	public int plus(int a, int b) {
		
		return a + b;
	}
	
	public int minus(int a, int b) {
		 
		return a - b;
	}
	
	public int multi(int a, int b) {
		
		return a * b;
	}
	
	public int divi(int a, int b) {
		
		return a / b;
	}
	
	public void say(int result) {
		System.out.println("result : " + result);
	}
	
	public String test(int a) {
		return "";
	}
	
	static void staticTest() {
		System.out.println("static 테스트 입니둥");
>>>>>>> branch 'main' of https://github.com/jeongminie/study_java.git
	}

}
