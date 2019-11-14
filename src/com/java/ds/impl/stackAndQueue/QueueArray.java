package com.ds.impl.stackAndQueue;

public class QueueArray<T> {
	
	Object[] queue;
	int first;
	int last;
	int size;

	public QueueArray(int size) {
		this.size = size;
		queue = new Object[size];
		first=-1;
		last=-1;
	}
	
	public void enQueue(Object newItem) {
		if(isQueueFull()) {
			System.out.println("Queue is full, cannot enQueue");
			return;
		}
		last = last+1;
		queue[last] = newItem;
		if(first==-1)
			first=0;
	}
	
	public T deQueue() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty, cannot deQueue");
			return null;
		}
		T item = (T) queue[last];
		first = first + 1;
		return item;
	}
	
	public boolean isQueueFull() {
		return (last==size-1);
	}
	
	public boolean isQueueEmpty() {
		return (first==-1 || first>last);
	}

}
