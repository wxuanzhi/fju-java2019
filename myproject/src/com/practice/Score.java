package com.practice;

public class Score {
	int value;
	public Score(String s) throws ScoreFormatException{
		try {
			value = Integer.parseInt(s);
		}catch(NumberFormatException e) {
			throw new ScoreFormatException();
		}
	

	}

}
