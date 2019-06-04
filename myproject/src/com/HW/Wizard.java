package com.HW;

public class Wizard {
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

	}

}
