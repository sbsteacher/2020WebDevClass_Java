package com.koreait.exam.ch01;

public class MyPrint2 {
	public static void main(String[] args) {
		//printf
		String nm = "홍길동";
		int age = 1229;
		float height = 176.6f;
		int weight = 67;
		
		System.out.println("제 이름은 " + nm + "입니다. 제 나이는 " 
				+ age + "살 입니다. \n제 키는 " + height + "cm입니다. 제 몸무게는 "
				+ weight + "kg 입니다.");
		
		System.out.printf("제 이름은 %s입니다. 제 나이는 %,d살 입니다. "
				+ "\n제 키는 %.1fcm입니다. 제 몸무게는 %dkg입니다."
				, nm, age, height, weight);
		
		int y = 2010;
		int m = 12;
		System.out.printf("%d%02d", y, m);
	}
}
