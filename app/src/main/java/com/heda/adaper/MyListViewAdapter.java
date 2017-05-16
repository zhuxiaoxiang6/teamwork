package com.heda.adaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.heda.entity.Login;
import com.heda.teamwork.R;

import java.util.ArrayList;

/**
 * Created by sujing on 2017/5/15.
 */

public class MyListViewAdapter extends BaseAdapter{
//显示列表的adapter
    private Context context;
    private ArrayList<Login> list = new ArrayList<Login>();
    LayoutInflater inflater=null;

    public MyListViewAdapter(Context context){
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    public void addData(ArrayList templist){
        list.addAll(templist);
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = inflater.inflate(R.layout.inflater_lv_item, null);
        ImageView image = (ImageView) view.findViewById(R.id.lv_image);
        TextView title = (TextView) view.findViewById(R.id.lv_title);

        Login login = list.get(position);
        image.setBackgroundResource(login.image);
        title.setText(login.title);

        return view;
    }
}
