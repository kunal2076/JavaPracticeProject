package com.ds.impl.stackAndQueue;

public class StackArrayDemo {

	public static void main(String[] args) {
		
		StackArray<Integer> stackVar = new StackArray<>(5);
		stackVar.push(2);
		stackVar.push(4);
		stackVar.push(8);
		stackVar.push(10);
		stackVar.push(15);
		stackVar.push(19);
		System.out.println();
		
		stackVar.readStack();
		System.out.println();
		
		while(!stackVar.isStackEmpty())
			System.out.println(stackVar.pop());
		System.out.println();
		
		stackVar.pop();
	}

}
