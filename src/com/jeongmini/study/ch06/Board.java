package com.jeongmini.study.ch06;

public class Board {
	
	String name = "윤정민";
	int view = 100;
	boolean useNy = true;
	
	//기본생성자
	Board() {
		
	}
	
	Board(String name) {
		this.name = name;
	}
	
	Board(String name, int view) {
		this.name = name;
		this.view = view;
	}
	
	Board(String name, boolean useNy) {
		this.name = name;
		this.useNy = useNy;
	}

	Board(String name, int view, boolean useNy) {
		this.name = name;
		this.view = view;
		this.useNy = useNy;
	}
	
	public void say() {
		System.out.println("이름 : " + this.name + " 조회수 : " + this.view + " 사용여부 : " + this.useNy);
		
	}
	
	//static
	static String title = "가입인사";
	
	static int staticTest(int a) {
		return a + 10;
	}
	
	
	int test() {
		//객체 생성
		Arithmetic arithmetic = new Arithmetic();
		
		//public 메소드
		arithmetic.test(10);
		
		return 1;
	}
	
	public void test2 () {
		
//		Arithmetic arithmetic = new Arithmetic();
//		arithmetic.staticTest();
		
		Arithmetic.staticTest();
	}
}