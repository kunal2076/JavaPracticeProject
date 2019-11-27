package com.java.algo.interviewquestions;

import java.util.*;

public class BasicCalculator {

	public static void main(String[] args) {
		
		int result = new BasicCalculator().basicCalculator("10+22-2/10");
		System.out.println(result);

	}
	
	int basicCalculator(String input) {
		int result = 0;
		
		if(input==null || input.length()==0) return result;
		
		int num = 0;
		char sign = '+';
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			
			if(Character.isDigit(input.charAt(i))) {
				num = num*10 + input.charAt(i) - '0';
				//System.out.println(num);
			}
			
			if((!Character.isDigit(input.charAt(i)) &&' '!=input.charAt(i)) || i==input.length()-1) {
				if(sign == '+') {
					stack.push(num);
				}
				if(sign == '-') {
					stack.push(-num);
				}
				if(sign == '*') {
					stack.push(stack.pop()*num);
				}
				if(sign == '/') {
					stack.push(stack.pop()/num);
				}
				sign = input.charAt(i);
				num=0;
			}
		}
		
		for(int i : stack) {
			result += i;
		}
		
		return result;
	}

}
