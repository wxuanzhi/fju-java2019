package com.wxuan;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int quantity = 0;
		while(quantity != -1) {
			System.out.println("請輸入待購物品及數量:");
			System.out.println("代購物品:");
			String name = scanner.next();
			System.out.println("數量:");
			quantity = scanner.nextInt();
			if(quantity == -1) {
				break;
			System.out.println("代購物品及數量 :" + name + "x" + quantity);

			
			}
		}
	}
}
