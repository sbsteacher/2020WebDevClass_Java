package com.koreait.exam.ch05;

public interface MyList {
	int size();
	
	void add(int val);
	void add(int index, int val);
	
	int remove(int index);
}
