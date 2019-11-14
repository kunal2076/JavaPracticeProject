package com.java.algo.interviewquestions;

import java.util.*;

public class CommonAncestors {

	public static void main(String[] args) {

	    int[][] parentChildPairs1 = new int[][] {
	        {1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5},
	        {4, 8}, {4, 9}, {9, 11}, {14, 4}, {13, 12}, {12, 9}
	    };

	    int[][] parentChildPairs2 = new int[][] {
	        {11, 10}, {11, 12}, {10, 2}, {10, 5}, {1, 3},
	        {2, 3}, {3, 4}, {5, 6}, {5, 7}, {7, 8}
	    };
	    
	    new CommonAncestors().hasCommonAncestor(parentChildPairs1,6,7);

	  }
	
	boolean hasCommonAncestor(int[][] pcPairs, int node1, int node2) {
		
		Map<Integer, List<Integer>> childAnsectorsMap = createMap(pcPairs);
		
		List<Integer> node1Ancestors = childAnsectorsMap.get(node1);
		List<Integer> node2Ancestors = childAnsectorsMap.get(node2);
		
		List<Integer> tempList = new ArrayList<Integer>(node1Ancestors);
		tempList.retainAll(node2Ancestors);
		
		if(tempList != null) {
			System.out.println(tempList.toString());
			return true;
		}
		
		return false;
	}
	
	int getImmediateAncestor(int[][] pcPairs, int node) {
		
		for(int i=0; i<pcPairs.length; i++) {
			if(pcPairs[i][1] == node) {
				return pcPairs[i][0];
			}
		}
		return -1;
	}
	
	Map<Integer, List<Integer>> createMap(int[][] pcPairs) {
		Map<Integer, List<Integer>> childAnsectorsMap = new HashMap<Integer, List<Integer>>();
		for(int i=0; i<pcPairs.length; i++) {
			List<Integer> ancestorList = childAnsectorsMap.get(pcPairs[i][1]);
			if(ancestorList != null) {
				ancestorList.add(pcPairs[i][0]);
				while(getImmediateAncestor(pcPairs, pcPairs[i][0]) > 0 && !ancestorList.contains(getImmediateAncestor(pcPairs, pcPairs[i][0]))) {
					ancestorList.add(getImmediateAncestor(pcPairs, pcPairs[i][0]));
				}
			}
			else {
				ancestorList = new ArrayList<Integer>();
				ancestorList.add(pcPairs[i][0]);
				while(getImmediateAncestor(pcPairs, pcPairs[i][0]) > 0 && !ancestorList.contains(getImmediateAncestor(pcPairs, pcPairs[i][0]))) {
					ancestorList.add(getImmediateAncestor(pcPairs, pcPairs[i][0]));
				}
			}
			childAnsectorsMap.put(pcPairs[i][1], ancestorList);
		}
		return childAnsectorsMap;
	}

}
