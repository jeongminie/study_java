package com.jeongmini.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] score = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		int sum = 0;
		double average = 0;
	
		//개인 평균
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
			}
			average = (sum/3.0);
			
			System.out.println(i+1 + "번째 학생의 평균은 : " + average);

			sum = 0;
		}
				
		System.out.println();
		
		//과목별 평균 [0][0] [1][0]
//		for(int j = 0; j < 3; j++) {
//			for(int i = 0; i < score.length; i++) {
//				sum += score[i][j];
//			}
//			average = (sum/5.0);
//
//			System.out.println(j+1 + "번째 과목의 평균은 : " + average);
//			
//			sum = 0;
//		}
		
		int[] sum2 = new int[3];
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.println(score[i][j]);
				sum2[j] += score[i][j];
				System.out.println("sum : " + sum2[j]);
			}
		}
		
		for(int i = 0; i < sum2.length; i++) {
			average = (double)sum2[i]/score.length;
			System.out.println(i+1 + "번째 과목의 평균은 : " + average);
		}

	}

}
