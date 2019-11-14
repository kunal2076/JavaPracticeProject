package com.java.algo.practice;

public class StringRotationCheck {

	public static void main(String[] args) {
		StringRotationCheck src = new StringRotationCheck();
		//boolean check = src.checkStringRotation("kunalshruti", "alshrutikun");
		boolean check = src.checkStringRotation("kunalshruti", "unalshrutik");
		System.out.println(check);
	}
	
	boolean checkStringRotation(String inputStr1, String inputStr2) {
		
		if(inputStr1.length() != inputStr2.length())
			return false;
		
		String str3 = inputStr1 + inputStr1;
		System.out.println(str3);
		if(str3.contains(inputStr2)) 
			return true;
		else
			return false;
	}

}
