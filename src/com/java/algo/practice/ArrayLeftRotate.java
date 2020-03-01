package com.java.algo.practice;

public class ArrayLeftRotate {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		
		for(int i=0; i<d; i++) {
			int first = a[0];
			for(int j=0; j<a.length-1; j++) {
				a[j] = a[j+1];
			}
			a[a.length-1] = first;
		}
		return a;
	}


	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		int[] result = rotLeft(a, 4);
		for(int i = 0; i < a.length; i++)
            System.out.print(result[i] + " ");
	}
}
