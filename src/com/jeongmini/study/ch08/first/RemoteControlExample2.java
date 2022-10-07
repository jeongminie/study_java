package com.jeongmini.study.ch08.first;

public class RemoteControlExample2 {

	public static void main(String[] args) {
		
		//인터페이스는 객체생성 불가능!
		//왼쪽 interface               오른쪽 구현한 class 
		RemoteControl2 remoteControl = new Television2();
		remoteControl.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		remoteControl.setVolume(-10);
		//static 객체생성 없이 사용가능
		RemoteControl2.changeBattery();
		remoteControl.turnOff();
		
//		Audio audio = new Audio();
//		Television television = new Television();
//		
////		audio.turnOn();
////		audio.turnOff();
//		television.turnOn();
//		television.setMute(true);
//		television.setMute(false);
//		television.setVolume(-10);
//		RemoteControl.changeBattery();
//		television.turnOff();
//		
//		System.out.println();
////		인터페이스를 구현한 클래스는 위에 처럼 일반클래스 객체 만들듯이 하면 않된다.
//		
////		인터페이스를 구현한 클래스를 사용해야 된다. 할때는
////		RemoteControl remoteControl;	// 인터페이스 변수 선언
////		remoteControl = new Audio();	// 구현객체로  초기화
//		
//		RemoteControl remoteControl = new Audio();
////		RemoteControl remoteControl = new Television();
//		
//		remoteControl.turnOn();
//		remoteControl.turnOff();
//		remoteControl.setMute(false);

	}

}
