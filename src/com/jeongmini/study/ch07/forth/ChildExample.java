package com.jeongmini.study.ch07.forth;

public class ChildExample {

	public static void main(String[] args) {
		
		int arr[] = {5, 3, 10};
		
		Parents parents = new Parents();
		parents.sortASC(arr);
		
		int result = parents.arithmetic(arr);
		System.out.println("sum : " + result);
		
		Child child = new Child();
		int result2 = child.arithmetic(arr);
		
		System.out.println("sum : " + result2);
		
		System.out.println("값 차이 : " + (result-result2));
	}

}
