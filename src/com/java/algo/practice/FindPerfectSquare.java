package com.java.algo.practice;

public class FindPerfectSquare {

	public static void main(String[] args) {
		
		int num = 14;
		boolean result =new FindPerfectSquare().isPerfectSquare(num);
		System.out.println(result);

	}
	
	boolean isPerfectSquare(int num) {

		long start = 1;
		long end = num;
		while (start < end) {
			long mid = start + (end - start) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}
		return start * start == num;
	}
	

	
	

}
