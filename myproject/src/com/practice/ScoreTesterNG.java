package com.practice;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScoreTesterNG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try{
			System.out.println("Please enter Math score:");
			int math = Integer.parseInt(scanner.nextLine());
			System.out.println("Please enter English score:");
			int english = Integer.parseInt(scanner.nextLine());
			int average = (math+english)/2;
			System.out.println("������" + average);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("�ƭȹB����~");
			JOptionPane.showMessageDialog(null, "Testing", "Title", 0);
	}
}
}