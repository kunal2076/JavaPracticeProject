package com.java.algo.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] inputArr = {7,5,1,9,0,2};
		new InsertionSort().insertionSort(inputArr);
		System.out.println(Arrays.toString(inputArr));
	}
	
	int[] insertionSort(int[] inputArr) {
		for(int i=1; i<inputArr.length; i++) {
			int current = inputArr[i];
			int j = i-1;
			while(j >= 0 && current < inputArr[j]) {
				inputArr[j+1] = inputArr[j];
				j--;
			}
			inputArr[j+1] = current;
		}
		return inputArr;
	}

}
