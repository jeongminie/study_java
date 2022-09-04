package com.jeongmini.study.ch06;

public class ArithmeticExample {

	public static void main(String[] args) {
<<<<<<< HEAD
		
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
		
		
=======
		//                              생성자
		//컴파일러가 기본생성자를 자동추가
		Arithmetic arithmetic = new Arithmetic();
		
		int result1 = arithmetic.plus(1, 2);
		int result2 = arithmetic.minus(1, 2);
		int result3 = arithmetic.multi(1, 2);
		int result4 = arithmetic.divi(1, 2);
		
		arithmetic.say(result1);
		arithmetic.say(result2);
		arithmetic.say(result3);
		arithmetic.say(result4);
>>>>>>> branch 'main' of https://github.com/jeongminie/study_java.git

	}

}
