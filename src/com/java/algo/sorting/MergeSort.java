package com.java.algo.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] inputArr = {7,5,1,9,0,2};
		new MergeSort().mergeSort(inputArr, 0, inputArr.length-1);
		System.out.println(Arrays.toString(inputArr));
	}
	
	void mergeSort(int[] inputArr, int left, int right) {
		
		if(right <= left) return;
		int mid = left + (right - left) / 2;
		
		mergeSort(inputArr, left, mid);
		mergeSort(inputArr, mid+1, right);
		
		merge(inputArr, left, mid, right);
		
	}
	
	void merge(int[] inputArr, int left, int mid, int right) {
		
		int l1 = mid - left + 1;
		int l2 = right - mid;
		
		int[] leftArr = new int[l1];
		int[] rightArr = new int[l2];
		
		for(int i=0; i<l1; i++) {
			leftArr[i] = inputArr[left+i];
		}
		
		for(int i=0; i<l2; i++) {
			rightArr[i] = inputArr[mid + 1 + i];
		}
		
		int i=0, j=0, k=1;
		
		while(i<l1 && j<l2) {
			if(leftArr[i] <= rightArr[j]) {
				inputArr[k++] = leftArr[i++];
			}
			else {
				inputArr[k++] = rightArr[j++];
			}
		}
		
		while(i<l1) {
			inputArr[k++] = leftArr[i++]; 
		}
		
		while(j<l2) {
			inputArr[k++] = rightArr[j++];
		}
		
	}

}
