package com.ds.impl.linkedlist;

/**
 * @author Kunal Alshi
 * Implementation of Singly Linked List
 */
public class SinglyLinkedList<T> {
	
	SinglyLinkedListNode head; 
	
	public SinglyLinkedList() {
		head=null;
	}
	
	public void addAtHead(Object value) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(value, null);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}	
	
	public void addAtTail(Object value) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(value, null);
		if(head == null)
			head = newNode;
		else {
			SinglyLinkedListNode temp = head;
			while (temp.next != null)
				temp = temp.next;
			
			temp.next = newNode;
		}
	}

	public void delete(Object value) {
		SinglyLinkedListNode temp = head;
		if(temp.value == value)
			head = head.next;
		else {
			while(temp.next.value != value)
				temp = temp.next;
			
			temp.next = temp.next.next;
		}
	}
	
	public void printList() {
		SinglyLinkedListNode temp = head;
		while(temp != null) {
			System.out.println((T)temp.value);
			temp = temp.next;
		}
		System.out.println("\n");
	}

}
