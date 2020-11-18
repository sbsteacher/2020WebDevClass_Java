package com.koreait.exam.ch06;

public class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.printf("강아지 %s가 멍~ 멍~\n", name);
	}
	
	public void seat() {
		System.out.printf("강아지 %s가 엎드렸습니다.\n", name);
	}
}
