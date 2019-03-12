package com.wxuan.aaa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FreqListTester {
	
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<20; i++) {
			list.add(0);
		}
		for(int i=0; i<10000; i++) {
			int r = random.nextInt(20);
			Integer freq = list.get(r);
			list.set(r,  freq + 1);
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}	
	}
	}
