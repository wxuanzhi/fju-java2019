package com.aft;

import java.util.Scanner;

public class TesterNG {

	public static void main(String[] args) {
		int bonus = 200000;
		int div = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("�h�֤H�n��?");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			div = bonus/n;
		}catch(ArithmeticException e) {
			System.out.println("�ƭȹB����~");
		}
		System.out.println("�C�ӤH�o" + div);

	}

}
