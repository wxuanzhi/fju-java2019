package com.practic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

public class Tester {

	public static void main(String[] args) {
	File dir = new File("C:\\Users");
	if(dir.exists() && dir.isDirectory()) {
		File[] files = dir.listFiles();
		for(File f:files) {
			if(f.isFile()) {
			System.out.println(f.getName());
		}
	}
		System.out.println(dir.mkdir());
		File dd = new File(dir, "aaaaaa/bbb/cc");
		System.out.println(dd.mkdirs());
		System.out.println(dir.delete());
		
		
		
		
	//int n = Integer.parseInt("36");
	/*try {
		FileReader fr = new FileReader("aa.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		/*File file = new File("aa.txt");
	if(file.exists() == true) {
		System.out.println(file.isDirectory());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.length());
		//System.out.println(file.isFile());
	}*/
}
}
}
