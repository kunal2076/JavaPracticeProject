package com.java.algo.practice;

import java.util.HashMap;

public class StringSherlockAndValidString {

	public static void main(String[] args) {
		String s = "aaabc";
		String result = isValid(s);
		System.out.println(result);
	}
	
	public static String isValid(String s) {
		
		HashMap<Character,Integer> map = new HashMap<>();
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), 1);
			}
			else {
				int curr = map.get(s.charAt(i));
				map.put(s.charAt(i), curr+1);
			}
		}
		
		for(int i : map.values()) {
			if(i>1 && i%2 == 1) {
				count = count +1;
			}		
		}

		if(count>1) {
			return "NO";	
		}
		else {
			return "YES";
		}
	}

}
