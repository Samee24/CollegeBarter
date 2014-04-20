package com.example.collegebarter;

import java.util.ArrayList;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class List_info extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_info);
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#659D32")));
		
		setTitle("Calculus - Stewart");
		
		ListView listview = (ListView) findViewById(R.id.userinterest_info);
		
		ArrayList<String> interests = new ArrayList<String>(4);
		
		interests.add("Economics");
		interests.add("Photography");
		interests.add("Soccer");
		interests.add("Reggae");
		interests.add("Radiohead");
		interests.add("Stamps");
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.single_item_info_list, R.id.interest_element, interests);
		listview.setAdapter(adapter);
	


	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_info, menu);
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



}
