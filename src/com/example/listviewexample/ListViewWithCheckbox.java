package com.example.listviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewWithCheckbox extends Activity{
	   
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_checkbox);
        init();
    }
	
	private void init(){
		ListView listView =(ListView)findViewById(R.id.list_checkbox);
		String[] values = new String[] {"Cupcake", "Donut","Froyo","Gingerbread"};
		//Parameters: (Context, Layout for the row, 
//		ID of the TextView to which the data is written, the Array of data)
	    // The checkbox for the each item is specified by the layout android.R.layout.simple_list_item_multiple_choice
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, values);
 
        // Setting adapter to the listview
        listView.setAdapter(adapter);
	}
}
