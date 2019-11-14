package com.java.algo.interviewquestions;

public class RegexMatching {

	public static void main(String[] args) {
		//System.out.println("Hello world!");

		String test = "e"; //et
		String regex = "b?ea?t";
		System.out.println(matches(test, regex));
	}

	static boolean matches(String test, String regex) {
		
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
		return true;
	}

}
