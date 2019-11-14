package com.java.algo.practice;

public class RepeatedStringCountA {

	public static void main(String[] args) {

		//String s = "aba";
		//long n = 10;
		
		String s = "a";
		long n = 1000000000000L;
		
		long result = repeatedString(s, n);
		System.out.println(result);
	}
	
	static long repeatedString(String s, long n) {
		long result = 0;
		String str = s;
		StringBuilder sb = new StringBuilder(s);
		
		while(sb.length() < n && sb.append(s).length() < n) {
				sb = sb.append(sb);
		}
		long r = str.concat(s).length() - n;
		if(r>0) {
			str = str.concat(s.substring(0, (int) r-1));
		}
		
		//System.out.println(str);
		
		for(int j=0; j<str.length(); j++) {
			if(str.charAt(j) == 'a') {
				result++;
			}
		}
		
		return result;
	}

}
