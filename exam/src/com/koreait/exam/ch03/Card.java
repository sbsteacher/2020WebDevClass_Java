package com.koreait.exam.ch03;

public class Card {
	private final String shape;
	private final String no;
		
	public Card(String shape, String no) {
		this.shape = shape;
		this.no = no;
	}
	
	public String getShape() {
		return shape;
	}
	
	public String getNo() {
		return no;
	}
		
	@Override
	public String toString() {
		return String.format("shape: %s / no: %s", this.shape, this.no);
	}
	
	
}
