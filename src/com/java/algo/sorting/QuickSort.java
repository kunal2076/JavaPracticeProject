package com.java.algo.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] input = {7, 2, 10, -5, 25, 0, 1};
		int len = input.length;
		new QuickSort().quickSort(input, 0, len-1);
		System.out.println(Arrays.toString(input));

	}
	
	void quickSort(int[] inputArr, int low, int high) {
		
		if(low < high) {
			int partitionIndex = partition(inputArr, low, high);
		
			quickSort(inputArr, low, partitionIndex - 1);
			quickSort(inputArr, partitionIndex + 1, high);
		}
		
	}
	
	int partition(int[] inputArr, int low, int high) {
		
		int pivot = inputArr[high];
		int i = low - 1;
		
		for(int j=low; j<high; j++) {
			
			if(inputArr[j] <= pivot) {
				i++;
				
				int temp = inputArr[i];
				inputArr[i] = inputArr[j];
				inputArr[j] = temp;
			}
		}
		
		int temp = inputArr[i+1];
		inputArr[i+1] = inputArr[high];
		inputArr[high] = temp;
		
		return i+1;
		
	}
	

}
