package com.HW;

public class Wizard extends Thread{
	public void thunder() {
		System.out.println("THUNDER START!!");
		try {
			sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("THUNDER END!!");
	}
	@Override
	public void run() {
		thunder();
	}
	public static void main(String[] args) {
		Wizard w1 = new Wizard();
		w1.start();
		try {
			w1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Wizard w2 = new Wizard();
		w2.start();
		try {
			w2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
