package com.java.ds.impl.linkedlist;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList<String>();
		singlyLinkedList.addAtHead("Kunal");
		singlyLinkedList.addAtHead("Vihaan");
		singlyLinkedList.addAtTail("Shruti");
		singlyLinkedList.addAtTail("Pooja");
		singlyLinkedList.addAtHead("Alshi");
		singlyLinkedList.printList();
		
		singlyLinkedList.addAtTail("friends");
		singlyLinkedList.delete("Shruti");
		singlyLinkedList.printList();
		
		singlyLinkedList.insertBefore("Kabadi", "Kunal");
		singlyLinkedList.printList();
	}

}
