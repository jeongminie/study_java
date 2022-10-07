package com.jeongmini.study.test;

public class Television implements RemoteControl {
	
	int volume = 0;
	
	@Override
	public void turnon() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnoff() {
		System.out.println("TV를 끕니다.");
	}
	
	@Override
	public void setvolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUMN ) {
			volume = RemoteControl.MAX_VOLUMN;
		} else {
			volume = RemoteControl.MIN_VOLUME;
		}
		
		System.out.println("현재 TV 볼륨 : " + volume);
	}

}
