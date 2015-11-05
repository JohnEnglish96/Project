package com.example.memorymatch1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GameBoard 
{
	ListView mListView;
	
	    
	    String[] gameTypes = new String[] {"4 cards", "6 cards", "8 cards", "10 cards", "12 cards",
	            "14 cards", "16 cards", "18 cards", "20 cards"};
	
	
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_game_board_selector);
	        mListView = (ListView) findViewById(R.id.list);
	
	        
	        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this,android.R.layout
	                .simple_list_item_1, gameTypes);
	
	        
	        mListView.setAdapter(countryAdapter);
	        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener()
	        {
	            @Override
	            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
	            {
	              
	                int itemPosition = position;
	
	                
	                String itemValue = (String)mListView.getItemAtPosition(position);
	
	                
	                Intent intent = new Intent(getApplicationContext(),gameActivity.class);
	
	                
	                
	                
	                
	
	                
	                startActivity(intent);
	            }
	        });
	    }
	
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.menu_game_board_selector, menu);
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
}
