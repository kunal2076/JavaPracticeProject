package com.java.algo.practice.array;

public class LongestSubarraySumAtmostK {
	
	/* Given an array of integers, our goal is to find the length of largest subarray having sum of its elements atmost ‘k’ where k>0.
	 * 
	 * Input : arr[] = {1, 2, 1, 0, 1, 1, 0}, k = 4 Output : 5 
	 * Explanation: {1, 2, 1} => sum = 4, length = 3 
	 * {1, 2, 1, 0}, {2, 1, 0, 1} => sum = 4, length = 4 
	 * {1, 0, 1, 1, 0} =>5 sum = 3, length = 5
	 * 
	 */

	public static void main(String[] args) {
		
		int[] input = {1, 2, 1, 0, 1, 1, 0};
		int k = 4;
		int result = new LongestSubarraySumAtmostK().lengthOfLongestSubarray2(input,k);
		System.out.println(result);

	}
	
	//brute-force approach
	int lengthOfLongestSubarray(int[] inputArr, int k) {
		int result = 0;
		for(int i=0; i<inputArr.length; i++) {
			int currSum = inputArr[i];
			for(int j=i+1; j<inputArr.length; j++) {
				currSum = currSum + inputArr[j];
				if(currSum > result && result <= k) {
					result = j-i+1;
				}
			}
		}
		return result;
	}
	
	//sliding window approach
	int lengthOfLongestSubarray2(int[] inputArr, int k) {
		int sum = 0;
		int cnt = 0, maxcnt = 0;

		for (int i = 0; i < inputArr.length; i++) {

			if ((sum + inputArr[i]) <= k) {
				sum += inputArr[i];
				cnt++;
			}
			
			else if (sum != 0) {
				sum = sum - inputArr[i - cnt] + inputArr[i];
			}

			// keep track of max length.
			maxcnt = Math.max(cnt, maxcnt);
		}
		return maxcnt;
	}
	

}
