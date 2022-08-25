package com.jeongmini.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		// 명시적 생성자를 사용하여 각체를 생성하고
		// 모든 필드를 출력
		Student student = new Student("윤정민", "010-0000-1111", 1);
		Student student2 = new Student("윤또비", "010-0000-2222");
		
		System.out.println(student.name + " " + student.ssn + " " + student.studentNo);
		System.out.println(student2.name + " " + student2.ssn + " " + student2.studentNo);
		

	}

}
