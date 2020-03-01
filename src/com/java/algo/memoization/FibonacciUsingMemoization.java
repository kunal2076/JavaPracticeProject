package com.java.algo.memoization;

import java.util.*;

public class FibonacciUsingMemoization {
	
	private Map<Integer, Integer> memo = new HashMap<>();
	
	public int fib(int n) {
		
		if(n<0) {
			throw new IllegalArgumentException("Index is negeative.");
		}
		
		if(n==0 || n==1) return n;
		
		if(memo.containsKey(n)) return memo.get(n);
		
		int result = fib(n-1) + fib(n-2);
		
		memo.put(n, result);
		
		return result;
	}
	

	public static void main(String[] args) {
		int result = new FibonacciUsingMemoization().fib(3);
		System.out.println(result);
	}

}
