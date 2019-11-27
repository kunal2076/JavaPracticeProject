package com.java.ds.impl.tree.bst;

public class Main {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(15);
		tree.insert(10);
		tree.insert(35);
		tree.insert(40);
		tree.insert(30);
		
		tree.traverseInOrder();
		System.out.println(tree.get(41));

	}

}
