package com.java.algo.practice;

import java.util.HashMap;

public class HashMapRansomNote {

	public static void main(String[] args) {

		String magazine1 = "give me one grand today night";
		String ransomNote1 = "give one grand today";
		
		String magazine2 = "two times three is not four";
		String ransomNote2 = "two times two is four";
		
		String magazine3 = "ive got a lovely bunch of coconuts";
		String ransomNote3 = "ive got some coconuts";		
		
		//String result = checkMagazine(magazine1, ransomNote1);
		//String result = checkMagazine(magazine2, ransomNote2);
		String result = checkMagazine(magazine3, ransomNote3);
		
		System.out.println(result);
		
	}
	
	public static String checkMagazine(String magazine, String ransomNote) {
		
		HashMap<String, Integer> mMap = new HashMap<>();
		HashMap<String, Integer> nMap = new HashMap<>();
		
		Integer counter = null;
		
		for(String s : magazine.split("[^a-zA-Z]+")) {
			counter = mMap.get(s);
			
			if(counter == null)
				mMap.put(s, 1);
			else
				mMap.put(s, counter + 1);
		}
		
		for(String s : ransomNote.split("[^a-zA-Z]+")) {
			counter = nMap.get(s);
			
			if(counter == null)
				nMap.put(s, 1);
			else
				nMap.put(s, counter + 1);
		}
		
		for(String s : nMap.keySet()) {
			if(!mMap.containsKey(s) || (mMap.get(s) < nMap.get(s))) {
				return "No";
			}
		}
		return "Yes";
		
	}

}
