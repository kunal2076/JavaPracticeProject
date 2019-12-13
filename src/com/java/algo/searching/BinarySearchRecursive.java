package com.java.algo.searching;

public class BinarySearchRecursive {

	public static void main(String[] args) {

		int[] input = {-99, -22, -15, 1, 7, 9, 100, 201};
		int value = 9;
		int result = new BinarySearchRecursive().binarySearchRecursive(input, value);
		System.out.println(result);
		
	}
	
	int binarySearchRecursive(int[] input, int value) {
		return binarySearchRecursive(input, 0, input.length, value);
	}
	
	int binarySearchRecursive(int[] input, int start, int end, int value) {
		
		if(start >= end)
			return -1;
		
		int mid = (start + end) / 2;
		if(input[mid] == value)
			return mid;
		else if(input[mid] > value)
			return binarySearchRecursive(input, start, mid, value);
		else
			return binarySearchRecursive(input, mid + 1, end, value);
		
	}

}
