package com.ds.impl.linkedlist;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<String>();
		doublyLinkedList.addAtHead("Alshi");
		doublyLinkedList.addAtHead("Kabadi");
		doublyLinkedList.addAtTail("Vihaan");
		doublyLinkedList.printList();
		doublyLinkedList.addAtHead("Avinash");
		doublyLinkedList.addAtTail("Surekha");
		doublyLinkedList.printList();
		doublyLinkedList.delete("Avinash");
		doublyLinkedList.printList();
		doublyLinkedList.delete("Surekha");
		doublyLinkedList.printList();
		doublyLinkedList.delete("Alshi");
		doublyLinkedList.printList();
	}

}
