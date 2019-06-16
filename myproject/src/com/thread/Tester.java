package com.thread;

public class Tester {

	public static void main(String[] args) {
		Breakfast breakfast = new Breakfast();
		breakfast.start();
		
		BrushTeeth bt = new BrushTeeth();
		Thread thread = new Thread(bt);
		thread.start();
	try {
		breakfast.join();
		thread.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println("Main end");
	
}
}

