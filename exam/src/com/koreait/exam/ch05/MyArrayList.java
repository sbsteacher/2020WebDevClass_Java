package com.koreait.exam.ch05;

public class MyArrayList implements MyList {

	private int[] arr;
	
	public MyArrayList() {
		arr = new int[0];
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int val) {
		int[] temp = new int[arr.length + 1];
		
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		
		temp[arr.length] = val;		
		arr = temp;
		
	}

	@Override
	public void add(int index, int val) {
		int[] temp = new int[arr.length + 1];
		
		for(int i=0; i<arr.length; i++) {
			
			if(i < index) {
				temp[i] = arr[i];
			} else {
				temp[i+1] = arr[i];
			}			
			
			//temp[i<index ? i : i+1] = arr[i];
		}		
		temp[index] = val;
		arr = temp;
	}

	@Override
	public int remove(int index) {
		int delVal = arr[index];
		int[] temp = new int[arr.length - 1];
		
		for(int i=0; i<temp.length; i++) {
			if(i < index) {
				temp[i] = arr[i];
			} else {
				temp[i] = arr[i+1];
			}
			
			//temp[i] = arr[i < index ? i : i+1];
		}
		arr = temp;		
		return delVal;
	}
	
	public void showMyArr() {
		
		for(int i=0; i<arr.length; i++)	{	
			System.out.printf("%d : %d\n", i, arr[i]);
		}
	}

}







