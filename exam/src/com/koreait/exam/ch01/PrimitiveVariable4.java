package com.koreait.exam.ch01;

public class PrimitiveVariable4 {
	public static void main(String[] args) {
		byte j1 = 120; //강제 형변환
		System.out.println(j1);
		
		short j2 = j1;//자동 형변환
		System.out.println(j2);
		
		long j3 = 120;
		
		int j4 = (int)j3;
		
	}
}
