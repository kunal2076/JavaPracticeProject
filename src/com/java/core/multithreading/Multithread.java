package com.java.core.multithreading;

class MultithreadingDemo extends java.lang.Thread {
	
	public MultithreadingDemo() {
		super("super - inside MultithreadingDemo constructor");
		System.out.println("print - inside MultithreadingDemo constructor");
		start();
	}
	
	public void run() {

		try {
			System.out.println("Thread id = " + Thread.currentThread().getId() + ", Thread name = " + Thread.currentThread().getName() 
					+ ", Thread state = " + Thread.currentThread().getState()  + ", Thread priority = " + Thread.currentThread().getPriority());

			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("thread interrupted");
			e.printStackTrace();
		}
		
		System.out.println("Thread run is over");
	}
	
}

public class Multithread {
	
	public static void main(String[] args) throws InterruptedException {
		
		//MultithreadingDemo demo = new MultithreadingDemo();
		
		/*while(demo.isAlive()) {
			System.out.println("Main thread alive");
			Thread.sleep(1500);
		}*/
		
		
		for(int i=0; i<3; i++) {
			MultithreadingDemo demo = new MultithreadingDemo();
			demo.start();
		}
	}
}
