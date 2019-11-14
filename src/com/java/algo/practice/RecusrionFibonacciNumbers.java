package com.java.algo.practice;

public class RecusrionFibonacciNumbers {

	public static void main(String[] args) {

		int n = 5;
		int result = fibonacciFunction(n);
		
		System.out.println(result);
	}
	
	static int fibonacciFunction(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibonacciFunction(n-1) + fibonacciFunction(n-2);
			
	}

}
