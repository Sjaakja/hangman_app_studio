package com.example.hangman_timetosaveyourfriends;

import java.util.Random;

import android.content.Context;
import android.content.SharedPreferences;

public class GamePlay {
	
	SharedPreferences my_settings;
	Integer amountWrong;
	
	public String getWord(Context context) {
		
		// Get length of word from shared preferences
		my_settings = context.getSharedPreferences("MySettings", Context.MODE_PRIVATE);
		
		// Get proper stringArray from words_hangman.xml
		String wordArray = "words_" + my_settings.getInt("lengthWord", 1);
		Integer wordID = context.getResources().getIdentifier(wordArray, "array", context.getPackageName()); 
		String[] words = context.getResources().getStringArray(wordID);
				
		// Get random word from array
		int index = new Random().nextInt(words.length);
		String random = (words[index]);

		// Return random word
		return random;	
	}

	public String updateScore(Context context) {
		
		my_settings = context.getSharedPreferences("MySettings", Context.MODE_PRIVATE);
		int score = my_settings.getInt("score", -1);
		int wrong = my_settings.getInt("wrongGuess", 0);
		score += 1;
		String scoreView = score + "/" + wrong;
		
		return scoreView;
	}
	
	
	
	

}
