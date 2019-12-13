package com.java.ds.impl.stackAndQueue;

public class StackArrayDemo {

	public static void main(String[] args) {
		
		StackArray<Integer> stackVar = new StackArray<>(5);
		stackVar.push(2);
		stackVar.push(4);
		stackVar.push(8);
		
		System.out.println(stackVar.peek());
		
		stackVar.push(10);
		stackVar.push(15);
		stackVar.push(19);
		
		System.out.print("\n");
		stackVar.printStack();
		System.out.println();
		
		while(!stackVar.isStackEmpty())
			System.out.println(stackVar.pop());
		System.out.println();
		
		stackVar.pop();
	}

}
