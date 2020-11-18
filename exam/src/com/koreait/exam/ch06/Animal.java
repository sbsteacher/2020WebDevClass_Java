package com.koreait.exam.ch06;

public class Animal {
	protected String name;
	
	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public void cry() {
		System.out.printf("%s가 운다~~\n", this.name);
	}
}
