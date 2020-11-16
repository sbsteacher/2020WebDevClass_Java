package com.koreait.exam.ch02;

public class MethodMission1 {
	public static void main(String[] args) {
		printStarRevTri(4);
	}
	
	public static void printStarRevTri(int cnt) {
		for(int i=cnt; i>0; i--) {
			printStar(i);
		}
	}
	
	
	public static void printStarTri(int cnt) {
		for(int i=1; i<=cnt; i++) {
			printStar(i);
		}
	}
	
	public static void printStarSqure(int cnt) {
		for(int i=0; i<cnt; i++) {
			printStar(cnt);
		}
	}	
	
	public static void printStar(int cnt) {
		for(int i=0; i<cnt; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
