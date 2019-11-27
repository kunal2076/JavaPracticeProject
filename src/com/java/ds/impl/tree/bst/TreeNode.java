package com.java.ds.impl.tree.bst;

public class TreeNode {
	
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
	}
	
	public void insert(int newVal) {
		if(newVal == this.val) {
			return;
		}
		if(newVal < this.val) {
			if(left == null) {
				left = new TreeNode(newVal);
			}
			else {
				left.insert(newVal);
			}
		}
		else {
			if(right == null) {
				right = new TreeNode(newVal);
			}
			else {
				right.insert(newVal);
			}
		}
	}
	
	public void traverseInOrder() {
		if(left != null) {
			left.traverseInOrder();
		}
		
		System.out.println("Values = " + val);
		
		if(right != null) {
			right.traverseInOrder();
		}
	}
	
	public TreeNode get(int value) {
		if(value == this.val) {
			return this;
		}
		
		if(value < this.val) {
			if (left != null) {
				return left.get(value);
			}
		}
		else {
			if(right != null) {
				return right.get(value);
			}
		}
		return null;
	}
	
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	
	

}
