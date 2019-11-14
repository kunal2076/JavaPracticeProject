package com.java.algo.practice;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String[] str = {"flower","flow","flight"};
		//String result = longestCommonPrefixHorizontalScanning(str);
		String result = longestCommonPrefixVerticalScanning(str);
		System.out.println(result);
		
	}
	
	public static String longestCommonPrefixHorizontalScanning(String[] str) {
		
		if(str.length == 0) return "";
		String prefix = str[0];
		for(int i=1; i<str.length; i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if(prefix.isEmpty()) return "";
			}
		}
		return prefix;
		
	}	
	
	public static String longestCommonPrefixVerticalScanning (String[] str) {
		
		if(str == null || str.length == 0) return "";
		for(int i=0; i<str[0].length(); i++) {
			char c = str[0].charAt(i);
			for(int j=1; j<str.length; j++) {
				if(i == str[j].length() || str[j].charAt(i) != c) {
					return str[0].substring(0, i);
				}
			}
		}
		return str[0];
	}
	
}
