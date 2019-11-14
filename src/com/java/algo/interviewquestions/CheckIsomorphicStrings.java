package com.java.algo.interviewquestions;

import java.util.*;

public class CheckIsomorphicStrings {
	
	public static void main(String args[]) {
		String s = "ab";
		String t = "aa";
		
		System.out.println(new CheckIsomorphicStrings().isIsomorphic(s,t));
	}
	
	boolean isIsomorphic(String s, String t) {
		Map m = new HashMap();
		for(int i=0; i<s.length(); i++) {
			if(m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i))
				return false;
		}
		return true;
	}

}
