package com.mood.analyse;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String moodAnalyse() {

		String words[] = message.split(" ");
		if (words[3].equalsIgnoreCase("sad"))
			return "SAD";
		return "HAPPY";
	}
}
