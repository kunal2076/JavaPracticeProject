package com.java.algo.temp;
import java.util.*;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution3 {
	
	public static void main (String[] args) {
		int[][] a = {{1,8}, {2,15}, {3,9}};
		List a1 = Arrays.asList(a);
		
		int[][] b = {{1,8}, {2,11}, {3,12}};
		List b1 = Arrays.asList(b);
		
		optimalUtilization(20,a1,b1);
		
	}
	
	
	
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    static List<List<Integer>> optimalUtilization(
	                        int deviceCapacity, 
                            List<List<Integer>> foregroundAppList,
                            List<List<Integer>> backgroundAppList)
	{
        // WRITE YOUR CODE HERE
        List<Integer> resultInnerList = new ArrayList<Integer>();
        List<List<Integer>> resultOuterList = new ArrayList<List<Integer>>();;
        
        List<Integer> foreGroundAppInnerList;
        List<Integer> backGroundAppInnerList;
        
        int result = 0;
        int sum = 0;
        
        for(int i=0; i<foregroundAppList.size(); i++) {
            foreGroundAppInnerList = foregroundAppList.get(i);
            
            for(int j=0; j<backgroundAppList.size(); j++) {
                backGroundAppInnerList = backgroundAppList.get(j);
                
                if((foreGroundAppInnerList.get(1) + backGroundAppInnerList.get(1)) 
                    <= deviceCapacity) {
                        
                        sum = foreGroundAppInnerList.get(1) + backGroundAppInnerList.get(1);
                        
                        if(result <= sum) {
                            result = sum;
                        }
                    }
            }
        }
            
        for(int i=0; i<foregroundAppList.size(); i++) {
            foreGroundAppInnerList = foregroundAppList.get(i);
            
            for(int j=0; j<backgroundAppList.size(); j++) {
                backGroundAppInnerList = backgroundAppList.get(j);
                
                if(result == (foreGroundAppInnerList.get(1) + backGroundAppInnerList.get(1))) {
                    resultInnerList.add(foreGroundAppInnerList.get(0));
                    resultInnerList.add(backGroundAppInnerList.get(0));
                    resultOuterList.add(resultInnerList);
                    break;
                }
            }
        }
        
        return resultOuterList;
        
    }
    // METHOD SIGNATURE ENDS
}