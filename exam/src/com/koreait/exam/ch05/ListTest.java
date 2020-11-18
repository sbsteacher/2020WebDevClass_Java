package com.koreait.exam.ch05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.koreait.exam.ch03.Card;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(30);
		list.add(4);
		
		list.add(1, 100);
		
		int delVal = list.remove(0);
		
		System.out.println("delVal : " + delVal);
	
		
		for(int i=0; i<list.size(); i++) {
			int val = list.get(i);
			
			System.out.println(val);
		}

	}

}
