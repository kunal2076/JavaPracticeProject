package com.java.algo.searching;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		
		int[] inputArr = {2, 5, 8, 10, 22, 24, 30}; //array should be in ascending order
		int searchNum = 24;
		int pos = binarySearch(inputArr, searchNum);
		//System.out.println(pos);
	}
	
	static int binarySearch(int[] inputArr, int searchNum) {
		
		int len = inputArr.length;
		int low = 0;
		int high = len-1;
		int count = 0;
		int mid = 0;
		
		while(true) {
			mid = low + (high-low)/2;
			count++;
			if(inputArr[mid] == searchNum) {
				System.out.println("Element exists and found at position " + mid + " after " + count + " tries");
				break;
			}
			if(low>high) {
				System.out.println("The element is not found even after " + count + " tries");
				break;
			}
				
			if(inputArr[mid] < searchNum)
				low = mid + 1;
			if(inputArr[mid] > searchNum)
				high = mid - 1;
		}
		
		return mid;
	}

}
