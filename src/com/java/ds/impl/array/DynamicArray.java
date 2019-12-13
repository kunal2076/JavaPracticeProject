package com.java.ds.impl.array;

import java.util.Arrays;

public class DynamicArray<T> {
	
	private Object[] dynamicArray;
	private int currLength;

	public DynamicArray() {
		dynamicArray = new Object[1];
		currLength=0;
	}

	public int getSize() {	
		return dynamicArray.length;
	}
	
	public T get(int index) {
		return (T) dynamicArray[index];
	}
	
	public void add(Object newItem) {
		ensureCapacity(currLength+1);
		dynamicArray[currLength++] = newItem;
	}
	
	public void ensureCapacity(int minCapacity) {
		int currCapacity = getSize();
		if(currCapacity <  minCapacity) {
			currCapacity = currCapacity * 2;
			dynamicArray = Arrays.copyOf(dynamicArray, currCapacity);
		}	
	}
}
