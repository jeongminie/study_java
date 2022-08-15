package com.jeongmini.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 3 ;
		
		switch(num) {
			case 1:
				System.out.println("1번");
				break;
			case 2:
				System.out.println("2번");
				break;
			default:
				System.out.println("1도 2도 아님");
				break;
		}
		
		String position = "사원";
		
		switch(position) {
			case ("사원"):
				System.out.println("연봉은 5000만원 입니다.");
				break;
			case ("대리"):
				System.out.println("연봉은 6000만원 입니다.");
				break;
			case ("과장"):
				System.out.println("연봉은 8000만원 입니다.");
				break;
			case ("부장"):
				System.out.println("연봉은 11000만원 입니다.");
				break;
			case ("사장"):
				System.out.println("연봉은 20000만원 입니다.");
				break;
			default:
				System.out.println("없는 직급입니다 다시 입력 하세요.");
				break;
		}
	}

}
