package com.koreait.exam.ch03;

public class EqualsTest {
	public static void main(String[] args) {
		NumBox nb1 = new NumBox(11);
		NumBox nb2 = new NumBox();
		
		nb1.setVal(10);
		nb2.setVal(12);
		
		Object obj = nb2;
		
		System.out.println(nb1.equals(nb2));
		
		System.out.println(nb1);
		System.out.println(nb2);
		
		String str = "ㅇㅇㅇ";
		
		System.out.println(str);
		System.out.println(str.toString());
	}
}
