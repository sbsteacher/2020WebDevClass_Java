package com.koreait.exam.ch06;

public class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void cry() {
		System.out.printf("고양이 %s가 야옹~~~\n", name);
	}
}
