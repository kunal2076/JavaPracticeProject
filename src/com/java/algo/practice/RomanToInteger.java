package com.java.algo.practice;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		int result = romanToInt(s);
		System.out.println(result);
	}
	
	static public int romanToInt(String s) {
        int result = 0;
        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            switch (ch) {
                case 'I':
                    result = result + 1;
                    break;
                case 'V':
                    if(i>0 && s.charAt(i-1) == 'I')
                        result = result + 3;
                    else
                        result = result + 5;
                    break;
                case 'X':
                    if(i>0 && s.charAt(i-1) == 'I')
                        result = result + 8;
                    else
                        result = result + 10;
                    break;
                case 'L':
                    if(i>0 && s.charAt(i-1) == 'X')
                        result = result + 30;
                    else
                        result = result + 50;
                    break;
                case 'C':
                    if(i>0 && s.charAt(i-1) == 'X')
                        result = result + 80;
                    else
                        result = result + 100;
                    break;
                case 'D':
                    if(i>0 && s.charAt(i-1) == 'C')
                        result = result + 300;
                    else
                        result = result + 500;
                    break;     
                case 'M':
                    if(i>0 && s.charAt(i-1) == 'C')
                        result = result + 800;
                    else
                        result = result + 1000;
                    break;                    
            }
        }
        return result;
    }

}
