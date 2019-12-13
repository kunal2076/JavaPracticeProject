package com.java.algo.practice.linkedlist;

public class ReverseLinkedList extends LinkedList {

	public static void main(String[] args) {

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		printList(head);

		// head = reverseRecursive(head);
		head = reverseIterative(head);
		printList(head);

	}

	static Node reverseRecursive(Node head) {
		if (head == null || head.next == null)
			return head;
		Node last = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		return last;
	}

	static Node reverseIterative(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
