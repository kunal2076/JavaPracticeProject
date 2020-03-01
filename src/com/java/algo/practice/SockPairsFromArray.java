package com.java.algo.practice;

import java.util.HashMap;
import java.util.Map;

// Find the number of pair of socks of the same size in the given array
public class SockPairsFromArray {

	public static void main(String[] args) {

		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int count = new SockPairsFromArray().findPairOfSocks(ar);
		System.out.println(count);
		
	}
	
	int findPairOfSocks(int[] input) {
		
		if(input == null || input.length <= 0) return -1;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<input.length; i++) {
			map.put(input[i], map.getOrDefault(input[i], 0) + 1);
		}
		
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    if(entry.getValue() >= 2) {
		    	count += entry.getValue()/2;
		    }
		}
		
		return count;
	}

}
