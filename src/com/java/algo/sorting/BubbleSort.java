package com.java.algo.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] inputArr = {7,5,1,9,0,2};
		new BubbleSort().bubbleSort(inputArr);
		System.out.println(Arrays.toString(inputArr));
	}
	
	int[] bubbleSort(int[] inputArr) {
		boolean sorted = false;
		int temp;
		while(!sorted) {
			sorted = true;
			for(int i=0; i<inputArr.length-1; i++) {
				if(inputArr[i] > inputArr[i+1]) {
					temp = inputArr[i];
					inputArr[i] = inputArr[i+1];
					inputArr[i+1] = temp;
					sorted = false;
				}
			}
		}
		return inputArr;
	}

}
