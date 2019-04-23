package com.aft;

import java.util.Scanner;

public class TesterNG {

	public static void main(String[] args) {
		int bonus = 200000;
		int div = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("多少人要分?");
		String number = scanner.nextLine();
		try {
			int n = Integer.parseInt(number);
			div = bonus/n;
		}catch(ArithmeticException e) {
			System.out.println("數值運算錯誤");
		}
		System.out.println("每個人得" + div);

	}

}
