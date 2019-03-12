package com.pra;
public class Practice {

	import java.util.ArrayList;
	import java.util.HashSet;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> list = new ArrayList<String>();
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("a");
	        list.add("b");
	        list.add("c");
	        list.add("c");
	        Set<String> quipu = new HashSet<String>(list);
	        for (String key : quipu) {
	            System.out.println(key + " : " + Collections.frequency(list, key));
	        }
	    }
	    	}

}
