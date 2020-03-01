package com.java.algo.interviewquestions;

public class RegexMatching {
	
	// uber
	// check if 'test' string follows the 'regex' pattern 
	// 1) any character before '?' in 'regex' string is optional and may not be preset in the 'test' string
	// 2) character without '?' in 'regex' string should be present in 'test' string for matchingg

	public static void main(String[] args) {
		//System.out.println("Hello world!");

		String test = "etxx"; //et
		String regex = "b?e?a?tx";
		System.out.println(matches(test, regex));
	}

	static boolean matches(String test, String regex) {
		
		if(test == null && regex == null) return true;
		if(test == null || regex == null) return false;
		
		int testLen = test.length();
		int regexLen = regex.length();
		
		if(testLen > regexLen) return false;
		
		int i=0, j=0;
		while((i < testLen) && (j < regexLen)) {
			if(test.charAt(i) == regex.charAt(j)) {
				i++; j++;
				if(j<regexLen && regex.charAt(j) == '?') {
					j++;
				}
			}
			else {
				if(j+1<regexLen && regex.charAt(j+1) == '?') {
					j=j+2;
				}
				else {
					return false;
				}
			}
		}
		
		if(i<testLen) return false;
		
		while(j < regexLen) {
			if(j+1<regexLen && regex.charAt(j+1) == '?') {
				j=j+2;
			}
			else {
				return false;
			}
		}
		
		return true;
		
		/*
		for(int i=0, j=0; i<test.length(); i++, j++) {
			if(test.charAt(i) != regex.charAt(j)) {
				if((j+1 < regex.length()) && (regex.charAt(j+1) != '?')) {
					return false;
				}
				else {
					j++;
					i--;
				}
			}
			else {
				if((j+1 < regex.length()) && (regex.charAt(j+1) == '?')) 
					j++;
			}
		}
		return true; */
	}

}
