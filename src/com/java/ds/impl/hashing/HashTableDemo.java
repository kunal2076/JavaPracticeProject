package com.java.ds.impl.hashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class HashTableDemo {
	
	public static void main (String[] args) {
		HashTableArray<String> hashTableArr = new HashTableArray<String>(7);
		hashTableArr.put(10, "Mexico");
		hashTableArr.put(33, "California");
		hashTableArr.put(52, "London");
		hashTableArr.put(19, "San Francisco");
		hashTableArr.put(7, "Walnut Creek");
		
		System.out.println(hashTableArr.get(7));
		System.out.println(hashTableArr.get(23));
		
		hashTableArr.put(7, "New York");
		System.out.println(hashTableArr.get(7));

		int x = 123;
		 Queue<Integer> q = new LinkedList<Integer>();
	        int temp;
	        while(x>0) {
	            temp = x%10;
	            q.add(temp);
	        }
	        
	        String result = "";
	        while(!q.isEmpty()) {
	            result = result + q.poll();
	        }
	}

}
