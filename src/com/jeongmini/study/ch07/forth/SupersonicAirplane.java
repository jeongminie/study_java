package com.jeongmini.study.ch07.forth;

public class SupersonicAirplane extends AirPlane{
	
	//constants 상수(final) 클래스를 만들어서 따로 관리하는것이 더 좋음
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	//실행클래스에서 부모 메소드에 바로 접근할수 없고 자식 클래스에서 분기해줘야함.
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
			super.fly();
		}
	}
	

}
