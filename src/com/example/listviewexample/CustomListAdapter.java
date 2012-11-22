package com.example.listviewexample;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomListAdapter extends BaseAdapter{

	private LayoutInflater mInflater;
	private ArrayList<String> mList;
	
	public CustomListAdapter(Context context, ArrayList<String> list){
		mInflater = LayoutInflater.from(context);
		mList = list;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Make a view to hold each row.
	 *
	 * @see android.widget.ListAdapter#getView(int, android.view.View,
	 *      android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		// A ViewHolder keeps references to children views to avoid unneccessary calls
		// to findViewById() on each row.
		ViewHolder holder;
		// When convertView is not null, we can reuse it directly, there is no need
		// to reinflate it. We only inflate a new View when the convertView supplied
		// by ListView is null.
		if(convertView == null){
			convertView = mInflater.inflate(R.layout.row, null);
			// Creates a ViewHolder and store references to the children views
			// we want to bind data to.
			holder = new ViewHolder();
			holder.tv = (TextView)convertView.findViewById(R.id.textView);
			convertView.setTag(holder);
		}else{
			// Get the ViewHolder back to get fast access
			holder = (ViewHolder)convertView.getTag();
		}
		holder.tv.setText(mList.get(position));
		return convertView;
	}

	private class ViewHolder{
		TextView tv;
	}
	
	/*
	 *Function to add a new item to the ListView 
	 */
	public void addItem(){
		mList.add("New Item");
		notifyDataSetChanged();
	}
	
	/*
	 * Function to delete an item from the ListView
	 */
	public void deleteItem(int position){
		mList.remove(position);
		notifyDataSetChanged();
	}
}
