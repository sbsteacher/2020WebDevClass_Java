package com.koreait.exam.ch01;

public class StringEqual{

	public static void main(String[] args) {
		int a = 10;
		
		String str2 = new String("안녕");
		String str3 = new String("안녕");
		
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));

	}

}

