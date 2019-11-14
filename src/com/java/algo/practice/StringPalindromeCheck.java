package com.java.algo.practice;

public class StringPalindromeCheck {

	public static void main(String[] args) {
		String str = "abccbab";
		String result = palindromeCheck(str);
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
	
}
