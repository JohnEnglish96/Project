package com.example.memorymatch1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ActivityMenu {
	private Button mPlayButton;
	
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_menu);
	
	        mPlayButton = (Button)findViewById(R.id.play_button);
	        mPlayButton.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View v) {
	                
	                Intent i = new Intent(getApplicationContext(), GameBoard.class);
	                startActivity(i);
	            }
	        });
	    }
	
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.menu_menu, menu);
	        return true;
	    }
	
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        int id = item.getItemId();
	        if (id == R.id.action_settings) {
	            return true;
	        }
	
	        return super.onOptionsItemSelected(item);
	    }
	}

