package com.koreait.exam.ch04;

import com.koreait.exam.ch03.NumBox;

public class RefPrimitiveDiff {

	public static void main(String[] args) {
		int n1 = 10;		
		changeInt(n1);		
		System.out.println("n1 : " + n1);
		
		NumBox nb1 = new NumBox(10);		
		changeNumBox(nb1);
		System.out.println("nb1.val : " + nb1.val);
	}	
	
	public static void changeInt(int num1) {
		num1 = 20;
	}
	
	public static void changeNumBox(NumBox numbox1) {
		numbox1.val = 20;
	}

}


