package com.koreait.exam.ch03;

public class Card {
	private String shape;
	private String no;
	
	public Card() {}
	
	public Card(String shape, String no) {
		this.shape = shape;
		this.no = no;
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return String.format("shape: %s / no: %s", this.shape, this.no);
	}
	
	
}
