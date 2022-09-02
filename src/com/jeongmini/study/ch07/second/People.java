package com.jeongmini.study.ch07.second;

public class People {
	
	public String name = "admin";
	public String ssn = "333333";
	
	//부모에 생성자가 존재
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		
	}
	
	public People() {

	}

}
