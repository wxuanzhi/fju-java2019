package com.practice;

public class ScoreFormatException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Score format invalid, cannot convert to int";
	}
	

}
