package com.jeongmini.study.ch10.first.third;

public class Util {
//	public static void(String) boxing(String a)
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	
	public String aaa (String name) {
		String xxxx = "";
		
		return xxxx;
	}

}
