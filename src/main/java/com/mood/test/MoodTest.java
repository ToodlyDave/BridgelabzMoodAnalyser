package com.mood.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mood.analyse.MoodAnalyser;
import com.mood.exception.MoodAnalysisException;

public class MoodTest {

	@Test
	public void moodSad() throws Exception {
		MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
		assertEquals("SAD", mood.moodAnalyse());

	}

	@Test
	public void moodHappy() throws Exception {
		MoodAnalyser mood = new MoodAnalyser("I am in any Mood");
		assertEquals("HAPPY", mood.moodAnalyse());

	}

	@Test(expected = MoodAnalysisException.class)
	public void moodNull() throws Exception {
		MoodAnalyser mood = new MoodAnalyser();
		mood.moodAnalyse();

	}

	@Test(expected = MoodAnalysisException.class)
	public void moodEmpty() throws Exception {
		MoodAnalyser mood = new MoodAnalyser("");
		mood.moodAnalyse();

	}

}
