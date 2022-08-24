package com.jeongmini.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
		Board board2 = new Board("한석구");
		Board board3 = new Board("이정재", 200);
		Board board4 = new Board("이정재", false);
		Board board5 = new Board("정우성", 300, false);
		
		board.say();
		board2.say();
		board3.say();
		board4.say();
		board5.say();
		
		//static은 new 객체 생성 없이 사용가능
		System.out.println("Board.title : " + Board.title);
		
		int result = Board.staticTest(10);
		System.err.println("result : " + result);
		
	}

}
