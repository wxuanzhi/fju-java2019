package com.wxuan;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> radio = new ArrayList<>();
		radio.add("���w�A�n");
		radio.add("�{�b���z�����@�h���p");
		radio.add("���U�Ӭ��z�I���@��'�t��'");
		radio.add("�{�b���z�����@�h���p");
		radio.add("�P�±z����ť �ڭ̩��Ѩ�");
		System.out.println(radio);
		
		Set<String> rank = new HashSet<>();
		rank.add("�Ĥ@�W:Jeff");
		rank.add("�ĤG�W:Tony");
		rank.add("�ĤT�W:Hank");
		rank.add("�ĥ|�W:Winnie");
		rank.add("�Ĥ��W:Amy");
		System.out.println(rank);
	}

}
