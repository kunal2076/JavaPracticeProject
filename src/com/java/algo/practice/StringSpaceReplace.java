package com.java.algo.practice;

public class StringSpaceReplace {

	public static void main(String[] args) {
		
		StringSpaceReplace ssr = new StringSpaceReplace();
		String outputString = ssr.stringSpaceReplace("     Kunal Alshi is a genius     ");
		System.out.println(outputString);
		
	}
	
	String stringSpaceReplace (String inputStr) {
		String outputString = "";
		
		outputString = inputStr.trim().replace(" ", "%20");
		
		return outputString;
	}

}
