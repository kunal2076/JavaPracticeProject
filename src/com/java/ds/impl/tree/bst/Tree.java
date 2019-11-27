package com.java.ds.impl.tree.bst;

public class Tree {
	
	private TreeNode root;
	
	public void insert(int newVal) {
		if(root == null) {
			root = new TreeNode(newVal);
		}
		else {
			root.insert(newVal);
		}
	}
	
	public void traverseInOrder() {
		root.traverseInOrder();
	}
	
	public TreeNode get(int value) {
		if(root != null) {
			return root.get(value);
		}
		return null;
	}

}
