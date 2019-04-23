package com.wxuan.aaa;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Jack");
		set.add("Banana");
		set.add("Jack");
		set.add("Tomato");
		set.add("Apple");
		System.out.println(set.size());
	}

}
