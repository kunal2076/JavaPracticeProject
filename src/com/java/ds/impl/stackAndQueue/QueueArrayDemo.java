package com.java.ds.impl.stackAndQueue;

public class QueueArrayDemo {

	public static void main(String[] args) {
		
		QueueArray<String> queueVar = new QueueArray<String>(5);
		queueVar.enQueue("Shruti");
		queueVar.enQueue("Vihaan");
		queueVar.enQueue("Pooja");
		queueVar.enQueue("Avinash");
		queueVar.enQueue("Surekha");
		queueVar.enQueue("Kunal");
		
		queueVar.printQueue();
		System.out.print("\n");
		
		while(!queueVar.isQueueEmpty()) {
			queueVar.deQueue();
		}
		System.out.println();
		
		queueVar.deQueue();
		
	}

}
