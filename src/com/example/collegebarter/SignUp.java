package com.example.collegebarter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends Activity {
	
	TextView mName;
	TextView mEmail;
	TextView mPassword;
	TextView mPassword2;
	Button mButton;
	String final_name = "";
	String final_email = "";
	String final_password = "";
	String final_password2 = "";
	
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);

		
		 mName = (TextView) findViewById(R.id.name_signup);
		 mEmail = (TextView) findViewById(R.id.email_signup);
		 mPassword = (TextView) findViewById(R.id.password_signup);
		 mPassword2 = (TextView) findViewById(R.id.password2_signup);
		 mButton = (Button) findViewById(R.id.signup_button);
		 
		mButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				if (fieldChecker() && emailChecker() && passwordCheck()){
				buttonGo();
				
				}
				
				
				
			}
		});
		
		
	}
	
	private boolean fieldChecker(){
		
		final_name= mName.getText().toString();
		final_email = mEmail.getText().toString().trim();
		final_password = mPassword.getText().toString();
		final_password2 = mPassword.getText().toString();
		
		if (final_name.isEmpty() || final_email.isEmpty() || final_password.isEmpty()){
			
			
			AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
			builder.setMessage("Please fill in all your fields")
				.setTitle("Error")
				.setPositiveButton(android.R.string.ok,null);
			
			AlertDialog dialog = builder.create();
			dialog.show();
			
			return false;
			
		}
	
		else return true;

	}
	
	private boolean emailChecker(){
		
		final_email = mEmail.getText().toString().trim();
		
		if (final_email.contains(".edu")){
			
			return true;
		}
		else {
			AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
			builder.setMessage("Please use a .edu address")
				.setTitle("Error")
				.setPositiveButton(android.R.string.ok,null);
			
			AlertDialog dialog = builder.create();
			dialog.show();
			
			
			
			
			return false;
		}
		
	}
	
	private boolean passwordCheck(){
		
		final_password = mPassword.getText().toString();
		final_password2 = mPassword2.getText().toString();
		
		
		if (final_password.equals(final_password2)){
			return true;
				
			}
			else {
				AlertDialog.Builder builder = new AlertDialog.Builder(SignUp.this);
				builder.setMessage("Your passwords do not match. Please try again")
					.setTitle("Error")
					.setPositiveButton(android.R.string.ok,null);
				
				AlertDialog dialog = builder.create();
				dialog.show();
				
				
				return false;
			}
	}
	
	private void buttonGo(){
		
		final_name= mName.getText().toString();
		final_email = mEmail.getText().toString().trim();
		final_password = mPassword.getText().toString();
		final_password2 = mPassword.getText().toString();
		
		Intent intent = new Intent(SignUp.this, LoginActivity.class);
		startActivity(intent);
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sing_up, menu);
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
