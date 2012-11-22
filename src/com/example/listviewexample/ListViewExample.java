package com.example.listviewexample;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListViewExample extends Activity implements OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_example);
        init();
    }
    
    private void init(){
    	Button simpleListView = (Button)findViewById(R.id.SimpleListViewButton);
    	simpleListView.setOnClickListener(this);
    	Button customListView = (Button)findViewById(R.id.CustomListViewButton);
    	customListView.setOnClickListener(this);
    	Button listViewCheckbox = (Button)findViewById(R.id.ListViewCheckboxButton);
    	listViewCheckbox.setOnClickListener(this);
    }
    
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.SimpleListViewButton:
			Intent intent = new Intent(this,SimpleListView.class);
			startActivity(intent);
			break;
		
		case R.id.CustomListViewButton:
			Intent intent1 = new Intent(this,CustomListView.class);
			startActivity(intent1);
			break;
			
		case R.id.ListViewCheckboxButton:
			Intent intent2 = new Intent(this,ListViewWithCheckbox.class);
			startActivity(intent2);
			break;
		}
	}
}
