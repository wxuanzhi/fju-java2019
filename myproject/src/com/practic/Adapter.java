package com.practic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;


public class Adapter {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("data.txt");
			Reader in = new InputStreamReader(fis);
			int n = in.read();
			while(n != -1) {
				System.out.println(n);
				n = in.read();
			}
		}catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}