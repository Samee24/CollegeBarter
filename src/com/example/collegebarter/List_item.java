package com.example.collegebarter;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class List_item extends Activity {

	private ArrayList<HashMap<String, String>> data;
	private HashMap<String, String> data_mini;
	TextView nameItem;
	TextView nameLocation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);
		
		setTitle("CollegeBarter");
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#659D32")));

		ListView listview = (ListView) findViewById(R.id.listView);
		
		

		data = new ArrayList<HashMap<String, String>>();

		data_mini = new HashMap<String, String>();

		data_mini.put("name", "Calculus - Stewart");
		data_mini.put("location", "Alaska");
		data_mini.put("image", Integer.toString(R.drawable.image0));

		data.add(data_mini);

		data_mini = new HashMap<String, String>();

		data_mini.put("name", "Seagate 150TB Harddrive");
		data_mini.put("location", "Arizona");
		data_mini.put("image", Integer.toString(R.drawable.image1));

		data.add(data_mini);

		data_mini = new HashMap<String, String>();

		data_mini.put("name", "Nike Dri-fit tanktop");
		data_mini.put("location", "Florida");
		data_mini.put("image", Integer.toString(R.drawable.image4));

		data.add(data_mini);

		data_mini = new HashMap<String, String>();

		data_mini.put("name", "Texas Instruments TX-423H");
		data_mini.put("location", "Grinnell");
		data_mini.put("image", Integer.toString(R.drawable.image3));

		data.add(data_mini);

		data_mini = new HashMap<String, String>();

		data_mini.put("name", "Used Futon");
		data_mini.put("location", "New York");
		data_mini.put("image", Integer.toString(R.drawable.image5));

		data.add(data_mini);
		
		data_mini = new HashMap<String, String>();

		data_mini.put("name", "Brand New Fridge");
		data_mini.put("location", "Washington");
		data_mini.put("image", Integer.toString(R.drawable.image6));

		data.add(data_mini);

		String[] keys = { "name", "location", "image"};
		int[] ids = { R.id.seller_name, R.id.location, R.id.image_list };
		
		
		
	

		SimpleAdapter adapter = new SimpleAdapter(this, data,
				R.layout.single_item_list, keys, ids);
      
            
            listview.setAdapter(adapter);
            
            
            listview.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int arg2, long arg3) {
					// TODO Auto-generated method stub
					
					Intent intent = new Intent(List_item.this, List_info.class);
					startActivity(intent);
					
				}
			});
  
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_item, menu);
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

}
