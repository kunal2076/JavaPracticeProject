package com.java.algo.practice.array;

import java.util.*;

public class FindDuplicatesInArray {
	
	public static void main(String[] args) {
		
		int[] input = {2,3,8,2,3,9,7,8};
		List<Integer> result = new FindDuplicatesInArray().findDuplicates(input);
		
		for(int dup : result) {
			System.out.println(dup);
		}
	}
	
	/*static List<Integer> findDuplicates(int[] nums) {
		int n = nums.length;
		List<Integer> ans = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			if (nums[i] <= n) {
				int prev = nums[i];
				nums[i] = 2 * n + 1;
				while (prev <= n) {
					if ((prev + n) == nums[prev - 1]) {
						ans.add(prev);
						break;
					} else {
						int t = nums[prev - 1];
						nums[prev - 1] = prev + n;
						prev = t;
					}
				}
			}
		}
		return ans;}*/
	
	List<Integer> findDuplicates(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			if(set.contains(nums[i])) {
				list.add(nums[i]);
			}
			else {
				set.add(nums[i]);
			}
		}
		return list;
	}

}
