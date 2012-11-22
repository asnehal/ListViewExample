package com.example.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleListView extends Activity{
   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_listview);
        init();
    }
	
	private void init(){
		ListView listView = (ListView)findViewById(R.id.simple_list);
		String[] values = new String[] {"Cupcake", "Donut","Froyo","Gingerbread"};

		//Parameters: (Context, Layout for the row, 
		//ID of the TextView to which the data is written, the Array of data)
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		  android.R.layout.simple_list_item_1, android.R.id.text1, values);

		// Setting adapter to ListView
		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> list, View view, int position,
					long arg3) {
				// TODO Auto-generated method stub
				TextView tv = (TextView)view.findViewById(android.R.id.text1);
				Toast.makeText(getApplicationContext(), tv.getText() + " clicked", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
