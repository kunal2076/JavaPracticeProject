package com.java.algo.interviewquestions;

public class BinaryNumberCountSteps {
	
	//tesla
	/* 2 actions can be performed on a number
	 * if even - divide by 2
	 * if odd - subtract 1
	 * 
	 * For the integer equivalent of a Binary number input, 
	 * calculate the number of operations performed till the number becomes 0
	 * 
	 */

	public static void main(String[] args) {
		
		String input = "011100"; // Decimal equivalent = 28
		//String input = "100"; // Decimal equivalent = 4
		//String input = "11110100001001000000"; // Decimal equivalent = 1,000,000
		
		int steps = new BinaryNumberCountSteps().getCountOfLettersToDelete(input);
		
		System.out.println(steps); //steps = 7 for input 28 //steps = 3 for input 4

	}
	
	int getCountOfLettersToDelete(String input) {
		int count = 0;
		while (input != null && input.length() > 0 && input.contains("1")) {
			if (input.charAt(input.length() - 1) == '0') {
				input = input.substring(0, input.length() - 1);
				// System.out.println( "in 0 " +input);
			} else {
				input = input.substring(0, input.length() - 1) + "0";
				// System.out.println( "in 1 " +input);
			}
			count++;
			System.out.println("input " + Integer.parseInt(input, 2));
		}
		return count;
	}
	
}
