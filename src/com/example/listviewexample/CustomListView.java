package com.example.listviewexample;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.ListView;

public class CustomListView extends Activity{
	   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_listview);
        
        init();
    }
	
	private void init(){
		ListView listView = (ListView)findViewById(R.id.custom_list);
		final CustomListAdapter adapter = new CustomListAdapter(getApplicationContext(), buildList());
		listView.setAdapter(adapter);
		
		Button button = (Button)findViewById(R.id.addButton);
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				adapter.addItem();
			}
		});
		
		listView.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> listview, View view,
					int position, long arg3) {
				// TODO Auto-generated method stub
				adapter.deleteItem(position);
				return true;
			}
		});
	}
	
	private ArrayList<String> buildList(){
		ArrayList<String> list  = new ArrayList<String>();
		for(int i=0;i<6;i++){
			list.add("List Item " + (i+1));
		}
		return list;
	}
		
}
