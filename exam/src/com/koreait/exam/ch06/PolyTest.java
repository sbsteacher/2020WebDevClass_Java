package com.koreait.exam.ch06;

public class PolyTest {

	public static void main(String[] args) {
		
		//Animal ani = new Cat("나비");
		
		//Cat cat = new Aniaml("나비");
		/*
		Cat cat = new Cat("나비");
		
		Animal ani = cat;
		
		Cat cat2 = (Cat)ani;
		
		cat2.cry();
		*/
				
		Animal ani = new Animal("나비");
		
		Cat cat2 = (Cat)ani;
		
		cat2.cry();
	}

}
