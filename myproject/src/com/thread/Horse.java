package com.thread;

public class Horse extends Thread {
	public Horse(String name) {
		setName(name);
	}
	@Override
	public void run() {
		
		for(int i=1; i<=50; i++) {
			StringBuilder spaces = new StringBuilder();
			for(int j=1; j<1; j++) {
				spaces.append(" ");
			}
			System.out.println(getName()+spaces.toString()+i);
			try {
				sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
