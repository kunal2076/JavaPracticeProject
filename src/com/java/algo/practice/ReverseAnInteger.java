package com.java.algo.practice;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAnInteger {

	/*public static void main(String[] args) {

		int x = -123;
		
	    int y = 0;
	    if(x<0)
	        y = Math.abs(x);
	    else
	    	y=x;
	    //System.out.println(y);
	    
	    int r = 0;
	    while(y > 0) {
	        r = r*10 + y%10;
	        y = y/10;
	    }
	    
	    if(x<0)
	        r = -1 * r; 
	    
	    System.out.println(r);
	}*/

	
	public static void main(String args[]) {
		
		 int x = -123; 
		 /*int rev = 0;
	        while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) System.out.println(0);
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) System.out.println(0);
	            rev = rev * 10 + pop;
	        }
	        //return rev;
	        System.out.println(rev);*/
		 
		 	Queue<Integer> q = new LinkedList<Integer>();
	        int temp;
	        while(Math.abs(x)>0) {
	            temp = x%10;
	            q.add(temp);
	        }
	        
	        String result = "";
	        while(!q.isEmpty()) {
	            result = result + q.poll();
	        }
	        
	        int output = Integer.valueOf(result);
	        if(x<0) 
	            output = output - (output*2);
	        
	        //return output;
	        System.out.println(result);
	        
	        
	        
	}

}
