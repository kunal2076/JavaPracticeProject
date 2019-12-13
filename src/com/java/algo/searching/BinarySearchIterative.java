package com.java.algo.searching;

public class BinarySearchIterative {

	public static void main(String[] args) {
		
		int[] input = {-99, -22, -15, 1, 7, 9, 100, 201};
		int value = 6;
		int result = new BinarySearchIterative().binarySearchIterative(input, value);
		System.out.println(result);
	}
	
	int binarySearchIterative(int[] input, int value) {
		
		int start = 0;
		int end = input.length;
		
		while(start < end) {
			int mid = (start + end) / 2;
			if(input[mid] == value) {
				return mid;
			}
			else if(input[mid] < value) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
		}
		return -1;
		
	}

}
