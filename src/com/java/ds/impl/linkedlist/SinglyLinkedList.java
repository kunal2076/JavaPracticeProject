package com.java.ds.impl.linkedlist;

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
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}	
	
	public void addAtTail(Object value) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
		if(head == null)
			head = newNode;
		else {
			SinglyLinkedListNode temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void insertBefore(Object value, Object insertBefore) {
		SinglyLinkedListNode newNode = new SinglyLinkedListNode(value);
		SinglyLinkedListNode insertBeforeNode = new SinglyLinkedListNode(insertBefore); 
		
		if(head == insertBeforeNode) {
			head = newNode;
			head.next = insertBeforeNode;
		}
		else {
			SinglyLinkedListNode temp = head;
			while(temp.next.value != insertBeforeNode.value) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = insertBeforeNode;
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
			System.out.print((T)temp.value);
			temp = temp.next;
			
			if(temp != null) System.out.print(" --> ");
		}
		System.out.println("\n");
	}

}
