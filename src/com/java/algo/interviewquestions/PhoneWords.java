package com.java.algo.interviewquestions;

import java.util.*;

public class PhoneWords {
	
	// Uber

	public static void main(String[] args) {

		Set<String> dictionary = new HashSet<>();
		dictionary.add("bat");
		dictionary.add("cat");
		dictionary.add("lion");
		dictionary.add("leopard");
		dictionary.add("ocelot");

		List<Integer> digits = new ArrayList<>();
		digits.add(2);
		digits.add(2);
		digits.add(8);

		List<String> output = new ArrayList<>();

		new PhoneWords().phoneWords(digits, dictionary, output);
		System.out.println(output); // should have "BAT", "CAT"
	}
	
	void phoneWords(List<Integer> digits, Set<String> dictionary, List<String> output) {
		
		Map<Integer, char[]> refMap = new HashMap<Integer, char[]>();
		refMap.put(2,new char[]{'a','b','c'});
		refMap.put(3,new char[]{'d','e','f'});
		refMap.put(4,new char[]{'g','h','i'});
		refMap.put(5,new char[]{'j','k','l'});
		refMap.put(6,new char[]{'m','n','o'});
		refMap.put(7,new char[]{'p','q','r','s'});
		refMap.put(8,new char[]{'t','u','v'});
		refMap.put(9,new char[]{'w','x','y','z'});
		
		Set<String> tempDictionary = new HashSet<>(dictionary);
		for(int i=0; i<digits.size(); i++) {
			char[] charArr = refMap.get(digits.get(i));
			Iterator<String> it = tempDictionary.iterator();
			while(it.hasNext()) {
				String s = it.next();
				if(new String(charArr).indexOf(s.charAt(i)) == -1) {
					it.remove();
				}
				//System.out.println(dictionary.toString());
			}
		}
		output.addAll(tempDictionary);
	}
        

}
