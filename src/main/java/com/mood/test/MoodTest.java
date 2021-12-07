package com.mood.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mood.MoodAnalyser;

public class MoodTest {

	@Test
	public void moodSad(){
		MoodAnalyser mood = new MoodAnalyser();
		assertEquals("SAD", mood.moodAnalyse("I am in Sad Mood") );
		
	}
	
}
