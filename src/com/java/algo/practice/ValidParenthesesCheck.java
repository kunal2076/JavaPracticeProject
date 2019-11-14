package com.java.algo.practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesCheck {
	
	public static void main(String[] args) {
		String str = "{[]}";
		boolean result = isValidParenthesesCheck(str);
		System.out.println(result);
	}
	
	public static boolean isValidParenthesesCheck(String str) {
		
		HashMap<Character, Character> mappings = new HashMap<Character, Character>();
		mappings.put('}', '{');
		mappings.put(')', '(');
		mappings.put(']', '[');
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(mappings.containsKey(c)) {
				
				char topElement = stack.empty() ? '#' : stack.pop();
				
				if(topElement != mappings.get(c)) {
					return false;
				}
			}
			else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
