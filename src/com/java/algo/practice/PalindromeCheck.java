package com.java.algo.practice;

public class PalindromeCheck {

	public static void main(String[] args) {
		
		boolean x = stringPalindromCheck("nitin");
		boolean y = numberPalindromeCheck(123211);

		System.out.println(x);
		System.out.println(y);
	}
	
	static boolean stringPalindromCheck(String input) {
		//String input = "nitin";
		String output = "";

		int n = input.length();

		for (int i = n - 1; i >= 0; i--) {
			output = output + input.charAt(i);
			// System.out.println(output);
		}

		if (input.equalsIgnoreCase(output))
			//System.out.println(true);
			return true;
		else
			//System.out.println(false);
			return false;
	}
	
	static boolean numberPalindromeCheck(int input) {
		
		if(input<0 || (input%10 == 0 && input > 0))
			return false;
		
		int reverseNumber = 0;
		while(input > reverseNumber) {
			reverseNumber = reverseNumber * 10 + input % 10;
			input = input / 10;
		}
		
		if(input == reverseNumber || input == reverseNumber/10)
			return true;
		else
			return false;
		
	}
 
}
