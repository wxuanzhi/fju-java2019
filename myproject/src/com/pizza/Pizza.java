  
  package com.pizza;

public class Pizza {
	int value;
	public Pizza(String s) throws CutFormatException{
		try {
			value = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			throw new CutFormatException();
		}
	}

}
  