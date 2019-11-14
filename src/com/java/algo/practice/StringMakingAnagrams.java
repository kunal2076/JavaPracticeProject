package com.java.algo.practice;

import java.util.HashMap;

public class StringMakingAnagrams {

	public static void main(String[] args) {
		String a = "abcabc";
		String b = "abcadbc";
		int res = makeAnagrams(a,b); 
		System.out.println(res);
	}
	
	public static int makeAnagrams(String a, String b) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		int count=0;
		
		for(int i=0; i<a.length(); i++) {
			if(map.get(a.charAt(i)) == null) {
				map.put(a.charAt(i), 1);
			}
			else {
				int curr = map.get(a.charAt(i));
				map.put(a.charAt(i), ++curr);
			}
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
