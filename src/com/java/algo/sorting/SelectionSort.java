package com.java.algo.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] inputArr = {7,5,1,9,0,2};
		new SelectionSort().selectionSort(inputArr);
		System.out.println(Arrays.toString(inputArr));
	}
	
	int[] selectionSort(int[] inputArr) {
		for(int i=0; i<inputArr.length; i++) {
			int min = inputArr[i];
			int minId = i;
			for(int j=i+1; j<inputArr.length; j++) {
				if(inputArr[j] < min) {
					min = inputArr[j];
					minId = j;
				}
			}
			int temp = inputArr[i];
			inputArr[i] = min;
			inputArr[minId] = temp;
		}
		return inputArr;
	}

}
