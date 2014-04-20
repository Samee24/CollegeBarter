package com.example.collegebarter;
import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
public class LoginActivity extends Activity {
	protected TextView mUsernameText;
	protected TextView mPasswordText;
	protected TextView mSignUpText;
	protected Button mLogInButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		mUsernameText = (TextView) findViewById(R.id.username);
		mPasswordText = (TextView) findViewById(R.id.password);
		mSignUpText = (TextView) findViewById(R.id.SignUp);
		mLogInButton = (Button) findViewById(R.id.login_button);
		
		setTitle("Login");
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#659D32")));
		
		mLogInButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Set the intent to send the user to the next activity
				// Converting inputed user data to string
				String username = mUsernameText.getText().toString();
				String password = mPasswordText.getText().toString();
				// Checking for WhiteSpace
				username = username.trim();
				if (username.isEmpty() || password.isEmpty()) {
					AlertDialog.Builder builder = new AlertDialog.Builder(
							LoginActivity.this);
					builder.setMessage("Please completely fill in your details");
					builder.setTitle("Error");
					builder.setPositiveButton(android.R.string.ok, null);
					AlertDialog dialog = builder.create();
					dialog.show();
				}
				else {
					Intent intent = new Intent(LoginActivity.this, List_item.class);
					startActivity(intent);
					
					
				}
			}
		});
		mSignUpText.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Set Intent to take you to the SignUP Screen
				Intent signUpIntent = new Intent(LoginActivity.this,
						SignUp.class);
				startActivity(signUpIntent);
			}
		});
	}
	// TODO Auto-generated method stub
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
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