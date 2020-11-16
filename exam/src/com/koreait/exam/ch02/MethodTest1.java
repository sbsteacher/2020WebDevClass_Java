package com.koreait.exam.ch02;

public class MethodTest1 {

	public static void main(String[] args) {
		int result = calc(5, 11);		
		System.out.println("결과 : " + result);
		System.out.println("result : " + calc(5, 11));
				
		calcVoid(5, 11);

	}
	
	public static int calc(int n1, int n2) {
		return n1 * 2 + n2;
	}
	
	public static void calcVoid(int n1, int n2) {
		System.out.println("result : " + calc(n1, n2));
		return;
	}

}
