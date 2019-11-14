package com.java.algo.practice;

public class StringUniqueChar {	
	
	boolean checkUniqueString (String inputString) {
		
		for(int i=0; i<inputString.length(); i++) 
			for(int j=i+1; j<inputString.length(); j++) 
				if(inputString.charAt(i) == inputString.charAt(j)) 
					return false;
		return true;
		
	}
	
	public static void main (String args[]) {
		
		StringUniqueChar obj = new StringUniqueChar();
		String inputString = "kunalas";
		
		if(obj.checkUniqueString(inputString))
			System.out.println("unique string");
		else
			System.out.println("not a unique string");
		
	}	

}
