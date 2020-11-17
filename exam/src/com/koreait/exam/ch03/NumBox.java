package com.koreait.exam.ch03;

public class NumBox {
	public int val;
	
	public NumBox() {}
	
	public NumBox(int val) {
		super();
		System.out.println("NumBox 기본 생성자 호출!!");
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	@Override
	public boolean equals(Object nb) {		
		return this.val == ((NumBox)nb).val;
	}
	
	
}
