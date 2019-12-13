package com.java.ds.impl.linkedlist;

/**
 * @author Kunal Alshi
 * Initialize a Singly Linked List Node
 */
public class SinglyLinkedListNode {
	
	Object value;
	SinglyLinkedListNode next;

	public SinglyLinkedListNode(Object value, SinglyLinkedListNode next) {
		this.value = value;
		this.next = next;
	}
	
	public SinglyLinkedListNode(Object value) {
		this.value = value;
		this.next = null;
	}

}
