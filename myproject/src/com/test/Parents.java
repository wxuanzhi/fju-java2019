package com.test;

public class Parents {
	float quantity;
	String name;
	
	public Parents(float quantity, String name) {
		this.quantity = quantity;
		this.name = name;
	}
	public void print(){
		System.out.println(quantity + "\t" + name);
	}
	

}
