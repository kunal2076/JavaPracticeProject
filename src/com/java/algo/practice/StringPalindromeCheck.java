package com.java.algo.practice;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		String str = "abcdexyedcba";
		String result = palindromCheck2(str);
		System.out.println(result);
	}
	
	public static String palindromeCheck(String str) {
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				continue;
			}
			else {
				return "Not a Palindrome";
			}
		}
		return "String is a Palindrome";
	}

	public static String palindromCheck2(String str) {
		
		if(str == null || str.length() <= 0) return "NO";
		
		int i = 0;
		while(i < str.length()/2) {
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return "NO";
			else
				i++;
		}
		return "YES";
	}
}
