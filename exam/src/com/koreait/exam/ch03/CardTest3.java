package com.koreait.exam.ch03;

public class CardTest3 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		
		//cardArray에 52장을 저장할 수 있게 공간 마련
		//Card 52장을 만드셔서 각 방에 넣어주세요!		
		
		
		for(int i=0; i<52; i++) {
			System.out.println(cd.pick());
		}
		
		System.out.println("-----");
		
		cd.showCards();
		
		
		
	}
}




//;