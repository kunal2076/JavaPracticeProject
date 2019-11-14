package com.java.algo.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] inputArr = {7,5,1,9,0,2};
		new MergeSort().mergeSort(inputArr, 0, inputArr.length-1);
		System.out.println(Arrays.toString(inputArr));
	}
	
	int[] mergeSort(int[] inputArr, int left, int right) {
		
	}

}
