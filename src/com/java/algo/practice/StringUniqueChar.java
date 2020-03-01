package com.java.algo.practice;

import java.util.*;

public class StringUniqueChar {	
	
	//brute-force approach - O(n^2) - not recommended
	boolean checkUniqueString (String inputString) {
		
		for(int i=0; i<inputString.length(); i++) 
			for(int j=i+1; j<inputString.length(); j++) 
				if(inputString.charAt(i) == inputString.charAt(j)) 
					return false;
		return true;
		
	}
	
	public static void main (String args[]) {
		
		StringUniqueChar obj = new StringUniqueChar();
		String inputString = "kunalals";
		
		if(obj.checkUniqueString3(inputString))
			System.out.println("unique string");
		else
			System.out.println("not a unique string");
		
	}	
	
	boolean checkUniqueString2(String input) {
		Set<Character> set = new HashSet<>();
		for(int i=0; i<input.length(); i++) {
			if(set.add(input.charAt(i)))
				continue;
			else
				return false;
		}
		return true;
	}
	
	// Optimal solution - coded in practice - this solution valid only for input = lowercase alphabets
	boolean checkUniqueString3(String input) {
		int[] arr = new int[26];
		for(int i=0; i<input.length(); i++) {
			arr[input.charAt(i) - 'a']++;
			if(arr[input.charAt(i) - 'a'] > 1) return false;
		}
		return true;
	}

}
