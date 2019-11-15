package com.java.algo.interviewquestions;

import java.util.*;
import java.util.Map.Entry;

public class DeleteLettersToObtainUniqueCount {
	
	//tesla
	//Count the number of letters to delete to obtain unique count of each letter in the String

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String input = "example";
		//String input = "aaaabbbb";
		String input = "ccaaffddecee";
		
		int count = new DeleteLettersToObtainUniqueCount().getCountOfLettersToDelete(input);
		System.out.println(count);

	}
	
	int getCountOfLettersToDelete(String input) {
		
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<input.length(); i++) {
			if(map.containsKey(input.charAt(i))) {
				int countOfLetters = map.get(input.charAt(i));
				map.put(input.charAt(i), countOfLetters+1);
			}
			else {
				map.put(input.charAt(i), 1);
			}
		}
		System.out.println(map);
		
		Set<Integer> set = new HashSet<Integer>();
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>) it.next();
			count = checkSet(pair.getValue(), set, count);
		}
		return count;
	}
	
	private int checkSet(int value, Set<Integer> set, int count) {
		System.out.println(set);
        if (!set.contains(value)) {
        	set.add(value);
        } else {
            if(value == 0) {
                return count++;
            }
            count = checkSet(value - 1, set, count++);
            set.add(value - 1);
            count++;
        }
        return count;
    }

}
