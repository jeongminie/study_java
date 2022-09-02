package com.jeongmini.study.ch07.forth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplan = new SupersonicAirplane();
		
		supersonicAirplan.takeOff();
		supersonicAirplan.fly();
		supersonicAirplan.flyMode = SupersonicAirplane.SUPERSONIC; //상수(static final)은 클래스이름.상수이름
		supersonicAirplan.fly();
		supersonicAirplan.flyMode = SupersonicAirplane.NORMAL;
		supersonicAirplan.fly();
		supersonicAirplan.land();
		
		//상수는 constants 상수(final) 클래스로 접근하는것이 좋음
		supersonicAirplan.takeOff();
		supersonicAirplan.fly();
		supersonicAirplan.flyMode = Constants.SUPERSONIC; //상수(static final)은 클래스이름.상수이름
		supersonicAirplan.fly();
		supersonicAirplan.flyMode = Constants.NORMAL;
		supersonicAirplan.fly();
		supersonicAirplan.land();

	}

}
