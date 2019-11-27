package com.java.algo.interviewquestions;

import java.util.*;

//  1   2   2   3   4   5 - Rank
//[100, 80, 80, 50, 30, 5] - LeaderBoard = Sorted array in descending order 

//[10, 25, 60, 80, 120, 60] Alice score after each game

//[5, 5, 3, 2, 1, 1] output = Alice's rank on LeaderBoard after each game

public class LeaderBoardRank {

	public static void main(String[] args) {
		
		int [] leaderBoard = {300, 100, 80, 80, 80, 50, 50, 30, 10, 10, 5, 5};
	    int [] aliceScore = {0, 80, 95, 60, 400, 120, 60, 0, 10, 4, 3, 0, 200};
	    
	    int[] output = new LeaderBoardRank().findRankings(leaderBoard,aliceScore);
	    System.out.println(Arrays.toString(output));

	}
	
	public int[] findRankings(int[] leaderBoard, int[] aliceScore) {
		
		int[] output = new int[aliceScore.length];
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int currRank = 1;
	    for(int i=0; i<leaderBoard.length; i++) {
	      if(!map.containsValue(leaderBoard[i])) {
	        map.put(currRank, leaderBoard[i]);
	        currRank++;
	      }
	    }
	    System.out.println(map);
	    
	    int finalRank = 0;
	    for(int i=0; i<aliceScore.length; i++) {
	    	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    		if(aliceScore[i] >= entry.getValue()) {
	    			if(finalRank>0 && finalRank <= entry.getKey()) {
	    				output[i] = finalRank;
	    			}
	    			else {
	    				output[i] = entry.getKey();
	    				finalRank = output[i];
	    			}
	    			break;
	    		}
	    		else {
	    			if(finalRank>0)
	    				output[i] = finalRank;
	    			else
	    				output[i] = map.size()+1;
	    			
	    		}
	    		
	    		if(output[i] == 1) {
	    			for(int k=i; k<output.length; k++) {
	    				output[k] = 1;
	    			}
	    			return output;
	    		}
	    	}
	    }
		
		return output;
	}
}
