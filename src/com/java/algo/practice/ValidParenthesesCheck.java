package com.java.algo.practice;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesCheck {
	
	public static void main(String[] args) {
		String str = "(){{[]}}[]";
		boolean result = isValidParenthesesCheck2(str);
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

	// alternate way - coded in practice
	public static boolean isValidParenthesesCheck2(String str) {
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			if(stack.isEmpty() && map.containsKey(str.charAt(i)))
				return false;
			
			if(!map.containsKey(str.charAt(i))) {
				stack.push(str.charAt(i));
			}
			else {
				if(stack.pop() == map.get(str.charAt(i)))
					continue;
				else
					return false;
			}
		}
		return stack.isEmpty();
	}


}
