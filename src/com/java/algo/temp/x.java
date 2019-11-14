package com.java.algo.temp;
import java.util.*;

public class x {
	
	public static void main(String[] args) {
		
		List parts = new ArrayList();
		parts.add(2);
		parts.add(1);
		parts.add(10);
		parts.add(5);
		parts.add(89);
		parts.add(35);
		
		int result = minimumTime(6, parts);
		System.out.println(result);
		
		
	}
	
	static int minimumTime(int numOfParts, List<Integer> parts)
    {
        // WRITE YOUR CODE HERE
		Collections.sort(parts);
        int sum = parts.get(0);
        int result = 0;
        for(int i=1; i<numOfParts; i++) {
            sum = sum + parts.get(i);
            result = result + sum;
        }
        return result;
    }

}
