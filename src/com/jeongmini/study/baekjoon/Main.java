package com.jeongmini.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pay = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		int sum = 0;
		
		for(int i = 1; i <= count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sum += i;
		}
		
		System.out.println(sum);
		
	}
}
