package com.jeongmini.study.ch09.second;

public class ThrowsExample {
	
	public static void findClass() throws ClassNotFoundException  {
		Class clazz = Class.forName("java.lang.String2");
	}

	//함수 사용할때 try구문 사용
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}

}
