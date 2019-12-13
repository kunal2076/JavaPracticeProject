package com.java.algo.practice.strings;

import java.util.*;

public class CharFrequencies {

	public static void main(String[] args) {
		
		String input = "aaaaaabbbbbbcd";
		
		boolean result = new CharFrequencies().checkCharFreq(input);
		System.out.println(result);

	}
	
	/*boolean checkCharFreq(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			int count = 1;
			if(map.containsKey(s.charAt(i))) {
				count = map.get(s.charAt(i));
				map.put(s.charAt(i), count+1);
			}
			else {
				map.put(s.charAt(i), count);
			}
		}
		//System.out.println(map);
		
		Set<Integer> set = new HashSet<>(map.values());
		System.out.println(set);
		
		if(set.size() == 1 || (set.size() == 2 && set.contains(1)))
			return true;
		else
			return false;
	}*/
	
	boolean checkCharFreq(String s) {
		
		if(s==null || s.length() == 0) return true;
		
		int[] a = new int[26];
		for(int i=0; i<s.length(); i++) {
			a[s.charAt(i) - 'a']++;
			//System.out.println(a[s.charAt(i) - 'a']);
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i] != 0 && )
			System.out.print(a[i]);
		}
		return true;
	}

}
