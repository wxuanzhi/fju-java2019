package com.pizza;

import java.util.Scanner;

public class Piece {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pizza �Q���X��?");
		int[] current = {8,12,16};
		try {
			Pizza piece = new Pizza(scanner.nextLine());
			if(piece.value==0) {
				System.out.println("�T�w������?");
			}else if(piece.value<=1||piece.value>16) {
				System.out.println("�W�X�d��");
			}else if(piece.value<current[0]||piece.value<current[1]||piece.value<current[2]) {
				System.out.println("�ƶq���~");
			}else if(piece.value==current[0]||piece.value==current[1]||piece.value==current[2]){
					System.out.println("���¿���");
		}
	}catch(CutFormatException e) {
	}
}
	}