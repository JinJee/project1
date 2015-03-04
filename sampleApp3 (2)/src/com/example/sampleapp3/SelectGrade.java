package com.example.sampleapp3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectGrade extends Activity{
	
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_selectgrade);
	}
	
    public void onGrade1(View view){
    	
    	Intent intent = new Intent(this, SelectedFreshman.class);
    	startActivity(intent);
    }
    
    public void onGrade2(View view){
    	
    	Intent intent = new Intent(this, SelectedSophmore.class);
    	startActivity(intent);
    }
	
    public void onGrade3(View view){
    	
    	Intent intent = new Intent(this, SelectedJunior.class);
    	startActivity(intent);
    }
    
    public void onGrade4(View view){
    	
    	Intent intent = new Intent(this, SelectedSenior.class);
    	startActivity(intent);
    }
}
