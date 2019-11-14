package com.java.algo.practice;

public class MinJumpsOnClouds {

	public static void main(String[] args) {

		//int[] c = {0, 0, 0, 0, 1, 0};
		//int[] c = {0, 0, 1, 0, 0, 1, 0};
		int[] c = {0, 0, 0, 1, 0, 0};
		
		int result = jumpingOnClouds(c);
		System.out.println(result);
		
	}
	
	public static int jumpingOnClouds(int[] c) {
		
		int n = c.length;
		int result = 0;
		
		for(int i=0; i<n-1; i++) {
			if ((i+2) < n && c[i+2] == 0) {
				i = i+1;
			}
			/*else if(c[i+1] == 0) {
				i=i;
			}*/
			result++;
		}
		
		return result;
	}

}
