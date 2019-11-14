package com.java.algo.interviewquestions;

import java.util.*;

public class PhoneWords {

	public static void main(String[] args) {

		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */

		Set<String> dictionary = new HashSet<>();
		dictionary.add("bat");
		dictionary.add("cat");
		dictionary.add("lion");
		dictionary.add("leopard");
		dictionary.add("ocelot");

		List<Integer> digits = new ArrayList<>();
		digits.add(3);
		digits.add(6);
		digits.add(4);

		List<String> output = new ArrayList<>();

		phoneWords(digits, dictionary, output);
		System.out.println(output); // should have "BAT", "CAT"
	}
	
	static void phoneWords(List<Integer> digits, Set<String> dictionary, List<String> output) {
		
		HashMap<Integer, char[]> refMap = new HashMap<Integer, char[]>();
		refMap.put(2,new char[]{'a','b','c'});
		refMap.put(3,new char[]{'d','e','f'});
		refMap.put(4,new char[]{'g','h','i'});
		refMap.put(5,new char[]{'j','k','l'});
		refMap.put(6,new char[]{'m','n','o'});
		refMap.put(7,new char[]{'p','q','r','s'});
		refMap.put(8,new char[]{'t','u','v'});
		refMap.put(9,new char[]{'w','x','y','z'});
		
		for(int i=0; i<digits.size(); i++) {
			char[] charArr = refMap.get(digits.get(i));
			Iterator<String> it = dictionary.iterator();
			while(it.hasNext()) {
				String s = it.next();
				if(new String(charArr).indexOf(s.charAt(i)) == -1) {
					it.remove();
				}
				//System.out.println(dictionary.toString());
			}
		}
		output.addAll(dictionary);
	}
        

}
