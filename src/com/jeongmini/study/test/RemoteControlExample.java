package com.jeongmini.study.test;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new Television();
		
		remoteControl.turnon();
		remoteControl.setmute(true);
		remoteControl.setmute(false);
		remoteControl.setvolume(100);
		RemoteControl.changeBattery();
		remoteControl.turnoff();
	}
}
