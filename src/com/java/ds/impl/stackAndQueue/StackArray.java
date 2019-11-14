package com.ds.impl.stackAndQueue;

public class StackArray<T> {
	
	Object[] stack;
	int size;
	int top;

	public StackArray(int size) {
		this.size = size;
		stack = new Object[size];
		top = -1;
	}

	public void push(Object newItem) {
		if(isStackFull()) {
			System.out.println("The stack is Full, cannot push");
			return;
		}
		top = top+1;
		stack[top] = newItem;
	}
	
	public T pop() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty, cannot pop");
			return null;
		}
		T item = (T) stack[top];
		top = top - 1;
		return item;
	}
	
	public void readStack() {
		for(Object obj : stack) {
			System.out.println(obj);
		}
	}
	
	public boolean isStackFull() {
		return (top == size-1);
	}
	
	public boolean isStackEmpty() {
		return (top == -1);
		
	}
}
