package com.java.algo.practice;

import java.util.LinkedList;

public class MergeTwoSortedLinkedLists {
	
	class Node {
		int val;
		Node next;
		Node(int val) {
			this.val = val;
			next = null;
		}
	}
	
	static ListNode head = null;

	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		l1.add(1);
		l1.add(3);
		l1.add(9);
		l1.add(11);
		
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(2);
		l2.add(5);
		l2.add(8);
		l2.add(9);
		
		System.out.println(l1);
		System.out.println(l2);
		
		LinkedList<Integer> l3 = new LinkedList<>();
		l3 = mergeSortedList(l1, l2);
		
		System.out.println(l3);
	}
	
	public LinkedList<Integer> mergeSortedList(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		
		LinkedList<Integer> l3 = null;
		while(l1 != null || l2 != null) {
			if(l1.getFirst() < l2.getFirst()) {
				l3.ge
			}
		}
		
		return l3;
	}

}
