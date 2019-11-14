package com.ds.impl.linkedlist;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
		singlyLinkedList.addAtHead("Kunal");
		singlyLinkedList.addAtHead("Vihaan");
		singlyLinkedList.addAtTail("Shruti");
		singlyLinkedList.printList();
		singlyLinkedList.addAtTail("friends");
		singlyLinkedList.delete("Shruti");
		singlyLinkedList.printList();
	}

}
