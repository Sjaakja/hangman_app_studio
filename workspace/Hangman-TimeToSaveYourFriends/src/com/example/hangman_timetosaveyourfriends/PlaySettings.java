package com.example.hangman_timetosaveyourfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;

public class PlaySettings extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_play_settings);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.play_settings, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_play_settings,
					container, false);
			
			final NumberPicker np1 = (NumberPicker) rootView.findViewById(R.id.numberPicker1);
		    np1.setMinValue(1);
		    np1.setMaxValue(26);
		    np1.setValue(1);
		    
		    final NumberPicker np2 = (NumberPicker) rootView.findViewById(R.id.numberPicker2);
		    np2.setMinValue(1);
		    np2.setMaxValue(20);		    
		    np2.setValue(5);
			
			Button button1 = (Button)rootView.findViewById(R.id.button1);
			button1.setOnClickListener(new View.OnClickListener() {
			    @Override
			    public void onClick(View view) {
			    	Intent activityChangeIntent = new Intent(getActivity(), Play.class);
			    	activityChangeIntent.putExtra("maxGuess", np1.getValue());
			    	activityChangeIntent.putExtra("maxLength", np2.getValue());
			    	getActivity().startActivity(activityChangeIntent);
			    }
			});
			
			return rootView;
		}
	}

}
