package com.java.algo.practice;

import java.util.*;

public class StringSherlockAndValidString {

	public static void main(String[] args) {
		String s = "abcdefghabcdefghi";
		String result = isValid2(s);
		System.out.println(result);
	}
	
	// wrong solution - as I understand the question - https: // www. hackerrank.com /challenges/ sherlock-and-valid-string/ problem
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

	public static String isValid2(String input) {
		
		if(input == null || input.length() <= 0) return "NO";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		int count = map.get(input.charAt(0));
		boolean flag = true;
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(count != entry.getValue()) {
				if(Math.abs(count - entry.getValue()) == 1 && flag == true) {
					flag = false;
				}
				else {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
