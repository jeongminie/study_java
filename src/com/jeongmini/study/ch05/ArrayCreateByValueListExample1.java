package com.jeongmini.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		int[] scoreChemistry = {88, 99, 45, 86, 34};
		int sum = 0;
		double average = 0;
		
		for(int i=0; i<scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		
		average = (sum/scoreChemistry.length);

		System.out.println("전체 평균은 : " + average);
	}

}
