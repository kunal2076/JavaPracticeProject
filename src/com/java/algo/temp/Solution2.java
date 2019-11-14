package com.java.algo.temp;
import java.util.Stack;

class Solution2
{
	public static void main(String args[]) {
		/*int num = 5;
		int[] arr = {2,5,7,4,8};
		System.out.println(generalizedGCD(num, arr));*/
		
		String s = "[";
		System.out.println(isValid(s));
	}
	
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    static public int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE
    	
    	int temp = 1;
    	for(int i=0;i<num-1; i++) {
    		if(arr[i+1] > arr[i]) {
	    		if((arr[i+1] % arr[i]) == 0)
	    			temp = arr[i+1] / arr[i];
	    	}
    		else {
    			if((arr[i] % arr[i+1]) == 0)
	    			temp = arr[i+1] / arr[i];
    		}
    	}
    	
    	return temp;
    }
    // METHOD SIGNATURE ENDS
    
    
    static public boolean isValid(String s) {
        
        char[] inputArr = s.toCharArray();
        Stack<Character> parenStack = new Stack<Character>();
        char check1, check2;
        
        for(int i=0; i<inputArr.length; i++) {
            parenStack.push(inputArr[i]);
            
            if(inputArr[i] == '}' || inputArr[i] == ')' || inputArr[i] == ']') {
                check1 = parenStack.pop();
                
                if(!parenStack.isEmpty()) {
                	check2 = parenStack.pop();
                }
                else
                	return false;
                
                if((check1 == ')' && check2 == '(') || (check1 == '}' && check2 == '{') || (check1 == ']' && check2 == '['))
                	continue;
                else
                	return false;
                
                /*if(check1 == check2) {
                    continue;
                }
                else {
                    return false;
                }*/
            }
            
        }
        
        if(parenStack.isEmpty())
        	return true;
        else
        	return false;
    }
}