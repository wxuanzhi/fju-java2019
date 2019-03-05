package com.wxuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> radio = new ArrayList<>();
		radio.add("早安你好");
		radio.add("現在為您播報一則路況");
		radio.add("接下來為您點播一首'演員'");
		radio.add("現在為您播報一則路況");
		radio.add("感謝您的收聽 我們明天見");
		System.out.println(radio);
		
		Set<String> rank = new HashSet<>();
		rank.add("第一名:Jeff");
		rank.add("第二名:Tony");
		rank.add("第三名:Hank");
		rank.add("第四名:Winnie");
		rank.add("第五名:Amy");
		System.out.println(rank);
	}

}
