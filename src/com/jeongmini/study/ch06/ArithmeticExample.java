package com.jeongmini.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
		
		Arithmetic arithmetic = new Arithmetic();
		
		arithmetic.addition(1, 2);
		arithmetic.subtraction(1, 2);
		arithmetic.multiplication(1, 2);
		arithmetic.division(1, 2);
		
		arithmetic.additionPrint();
		arithmetic.subtractionPrint();
		arithmetic.multiplicationPrint();
		arithmetic.divisionPrint();
		
		arithmetic.word("Hello", "World");
		
		

	}

}
