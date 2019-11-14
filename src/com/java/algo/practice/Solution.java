package com.java.algo.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
	
	public static void main(String args[]) {
		
		int[] states = {1,0,0,0,0,1,0,0};
		System.out.println("result = " +cellCompete(states, 1));
	
	}
    
// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  static public List<Integer> cellCompete(int[] states, int days)
  {
  // WRITE YOUR CODE HERE
  int temp=0;
  while(days>0) {
      for(int i=0; i<8; i++) {
          if(i == 0) {
              if(states[i+1] == 0) {
            	  temp = states[i];
                  states[i] = 0;
                  continue;
              }
              else {
            	  temp = states[i];
                  states[i] = 1;
                  continue;
              }
          }
          
          if(i == 7) {
              if(states[i-1] == 0) {
                  states[i] = 0;
                  continue;
              }
              else {
                  states[i] = 1;
                  continue;
              }
          }
          
          if(temp == states[i+1]) {
        	  temp = states[i];
              states[i] = 0;
              continue;
          }
          else {
        	  temp = states[i];
              states[i] = 1;
              continue;
          }
      }   
      days = days-1;
  }
  return Arrays.stream(states).boxed().collect(Collectors.toList());
  }
// METHOD SIGNATURE ENDS
}
