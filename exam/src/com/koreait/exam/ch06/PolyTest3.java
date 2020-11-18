package com.koreait.exam.ch06;

public class PolyTest3 {

	public static void main(String[] args) {
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("나비");
		Bird bird = new Bird("도널드덕");		
		
		cryAnimal(dog);
		cryAnimal(cat);
		cryAnimal(bird);
		
	}
	
	public static void cryAnimal(Animal ani) {
		ani.cry();
		
		if(ani instanceof Dog) {
			Dog dog = (Dog)ani;
			dog.seat();
			
			//((Dog)ani).seat();
		}
	}

}
