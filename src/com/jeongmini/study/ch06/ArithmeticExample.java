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

		//                              생성자
		//컴파일러가 기본생성자를 자동추가
		Arithmetic arithmetic1 = new Arithmetic();
		
		int result1 = arithmetic1.plus(1, 2);
		int result2 = arithmetic1.minus(1, 2);
		int result3 = arithmetic1.multi(1, 2);
		int result4 = arithmetic1.divi(1, 2);
		
		arithmetic1.say(result1);
		arithmetic1.say(result2);
		arithmetic1.say(result3);
		arithmetic1.say(result4);

	}

}
