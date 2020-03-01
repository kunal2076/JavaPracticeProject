package com.java.algo.interviewquestions;

import java.util.*;

public class CheckIsomorphicStrings {
	
	public static void main(String args[]) {
		String s = "ab";
		String t = "aa";
		
		System.out.println(new CheckIsomorphicStrings().isIsomorphic(s,t));
	}
	
	/* boolean isIsomorphic(String s, String t) {
		Map m = new HashMap();
		for(int i=0; i<s.length(); i++) {
			if(m.put(s.charAt(i), i) != m.put(t.charAt(i)+"", i))
				return false;
		}
		return true;
	} */
	
	public boolean isIsomorphic(String s, String t) {
        
        if(s == null && t == null) return true;
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        
        Map<Character, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                if(map.get(s.charAt(i)) == t.charAt(i)) {
                    continue;
                }
                else {
                    return false;
                }
            }
            else {
                if(!map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }

}
