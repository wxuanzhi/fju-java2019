package com.wxuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> bag = new ArrayList<>();
		bag.add(3);
		bag.add(95);
		bag.add(98);
		bag.add(3);
		System.out.println(bag);
		
		Set<Integer> bag1 = new HashSet<>();
		bag1.add(5);
		bag1.add(56);
		bag1.add(5);
		bag1.add(66);
		System.out.println(bag1);
		//不會把重複的字印出來
		
		
		
	}

}
