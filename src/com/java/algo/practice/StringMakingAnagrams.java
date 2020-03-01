package com.java.algo.practice;

import java.util.HashMap;

public class StringMakingAnagrams {

	public static void main(String[] args) {
		String a = "abcabcxxx";
		String b = "abcadbcyy";
		int res = makeAnagrams(a,b); 
		System.out.println(res);
	}
	
	public static int makeAnagrams(String a, String b) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		int count=0;
		
		for(int i=0; i<a.length(); i++) {
			map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
		}
		
		for(int j=0; j<b.length(); j++) {
			if(map.containsKey(b.charAt(j))) {
				int curr = map.get(b.charAt(j)); 
				if(curr == 1) {
					map.remove(b.charAt(j));
				}
				else {
					map.put(b.charAt(j), --curr);
				}
			}
			else {
				count ++;
			}
		}
		
		for(int i : map.values()) {
			count = count + i;
		}
		return count;
	}

}
