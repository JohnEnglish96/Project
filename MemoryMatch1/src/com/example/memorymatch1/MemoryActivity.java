package com.example.memorymatch1;

import android.support.v4.app.NotificationCompat.Action;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MemoryActivity extends Action {

	  	  @Override
	      protected void onCreate(Bundle savedInstanceState) {
	          super.onCreate(savedInstanceState);
	          setContentView(R.layout.activity_memory);
	  
	        
	      }
	  
	      @Override
	      public boolean onCreateOptionsMenu(Menu menu) {
	          getMenuInflater().inflate(R.menu.menu_game, menu);
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