package com.example.hangman_timetosaveyourfriends;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class PlaySettings extends Activity {

	NumberPicker wrongGuess;
	NumberPicker lengthWord;
	SharedPreferences my_settings;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_settings);
		
		wrongGuess = (NumberPicker) findViewById(R.id.wrongGuess);
		wrongGuess.setMinValue(1);
		wrongGuess.setMaxValue(26);
	    
		lengthWord = (NumberPicker) findViewById(R.id.lengthWord);
		lengthWord.setMinValue(1);
		lengthWord.setMaxValue(13);		    
		
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
		    @Override
		    public void onClick(View view) {
		    	Intent activityChangeIntent = new Intent(PlaySettings.this, Play.class);
		    	PlaySettings.this.startActivity(activityChangeIntent);
		}});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		my_settings = getSharedPreferences("MySettings", Context.MODE_PRIVATE);
		wrongGuess.setValue(my_settings.getInt("wrongGuess", 5));
		lengthWord.setValue(my_settings.getInt("lengthWord", 1));
				
	}

	@Override
	protected void onPause() {
		my_settings = getSharedPreferences("MySettings", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = my_settings.edit();
		editor.putInt("wrongGuess", wrongGuess.getValue());
		editor.putInt("lengthWord", lengthWord.getValue());
		editor.commit();
		
		super.onPause();
	}
	
}

