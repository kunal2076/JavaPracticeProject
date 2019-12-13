package com.java.ds.impl.linkedlist;

public class DoublyLinkedList<T> {
	
	DoublyLinkedListNode head;

	public DoublyLinkedList() {
		head = null;
	}
	
	public void addAtHead(Object value) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(value);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
	}	
	
	public void addAtTail(Object value) {
		DoublyLinkedListNode newNode = new DoublyLinkedListNode(value);
		if(head == null)
			head = newNode;
		else {
			DoublyLinkedListNode temp = head;
			while (temp.next != null)
				temp = temp.next;
			
			temp.next = newNode;
			newNode.prev = temp;
		}
	}

	public void delete(Object value) {
		DoublyLinkedListNode temp = head;
		if(temp.value == value) {
			head = head.next;
			head.prev = null;
		}
		else {
			while(temp.next.value != value)
				temp = temp.next;
			
			if(temp.next.next == null) {
				temp.next=null;
			}
			else {
				temp.next = temp.next.next;
				temp.next.prev = temp;
			}
		}
	}
	
	public void printList() {
		DoublyLinkedListNode temp = head;
		while(temp != null) {
			System.out.print((T)temp.value);
			temp = temp.next;
			
			if(temp!=null) System.out.print(" --> ");
		}
		System.out.println("\n");
	}



}
