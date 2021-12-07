package com.mood.analyse;

import com.mood.exception.MoodAnalysisException;

public class MoodAnalyser {

	private String message;

	public MoodAnalyser() {
		// TODO Auto-generated constructor stub
	}

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public String moodAnalyse() throws Exception {
		if (message == null)
			throw new MoodAnalysisException(" The string is null");
		if (message.equals(""))
			throw new MoodAnalysisException(" The string is empty");

		String words[] = message.split(" ");
		if (words[3].equalsIgnoreCase("sad"))
			return "SAD";
		return "HAPPY";
	}
}
