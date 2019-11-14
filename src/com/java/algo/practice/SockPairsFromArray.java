package com.java.algo.practice;

import java.util.HashMap;
import java.util.Map;

public class SockPairsFromArray {

	public static void main(String[] args) {

		int n = 9;
		int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int count = 0;
		
		HashMap<Integer, Integer> map = new HashMap();
		
		for (int i=0; i<n; i++) {
			if(map.containsKey(ar[i])) {
				int x = map.get(ar[i]);
				map.put(ar[i], x+1);
			}
			else {
				map.put(ar[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
		    //System.out.println(entry.getKey() + "/" + entry.getValue());
		    if(entry.getValue() >= 2) {
		    	count = count + entry.getValue()/2;
		    }
		}

		System.out.println(count);
	}

}
