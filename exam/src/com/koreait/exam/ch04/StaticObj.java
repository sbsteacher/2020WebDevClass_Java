package com.koreait.exam.ch04;

public class StaticObj {
	static int val;
	
	
	public static int sum(int n1, int n2) {
		return n1 + n2 + val;
	}
}

class NonStaticObj {
	int val;
	
	public int sum(int n1, int n2) {
		return n1 + n2 + val;
	}
}