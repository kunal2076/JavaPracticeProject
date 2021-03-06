package com.java.ds.impl.linkedlist;

/**
 * @author Kunal Alshi
 * Initialize a Doubly Linked List Node
 */
public class DoublyLinkedListNode {
	Object value = null;
	DoublyLinkedListNode prev;
	DoublyLinkedListNode next;

	public DoublyLinkedListNode(Object value, DoublyLinkedListNode prev, DoublyLinkedListNode next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}
	
	public DoublyLinkedListNode(Object value) {
		this.value = value;
		this.prev = null;
		this.next = null;
	}

}
