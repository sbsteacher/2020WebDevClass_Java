package com.koreait.exam.ch06;

public class PolyTest2 {

	public static void main(String[] args) {
		Animal ani = new Dog("바둑이");
		
		Dog dog = (Dog)ani;
		dog.seat();
		
		
	}

}
