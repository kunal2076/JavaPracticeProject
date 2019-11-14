package com.java.algo.practice;

public class RegexMatching {

	public static void main(String[] args) {

		boolean check1 = regexMatch("aa", "a*"); 
		System.out.println(check1);
	}
	
	static boolean regexMatch(String text, String pattern) {
		
		if(!text.equalsIgnoreCase(pattern) && !pattern.contains("*") && !pattern.contains(".")) {
			return false;
		}
		
		if(text.equalsIgnoreCase(pattern))
			return true;
		
		
		
	}

}
