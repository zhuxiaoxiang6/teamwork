package com.heda.teamwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.heda.adaper.MyListViewAdapter;
import com.heda.entity.Login;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private MyListViewAdapter adapter;
    private ArrayList<Login> listLogin = new ArrayList<Login>();
    Button btn_mylogin;
    ImageView myportrait;
    TextView myintroduce;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.mylistview);
        btn_mylogin = (Button) findViewById(R.id.btn_mylogin);
        myportrait = (ImageView) findViewById(R.id.myportrait);
        myintroduce = (TextView) findViewById(R.id.myintroduce);
        image = (ImageView) findViewById(R.id.myimage);

        adapter = new MyListViewAdapter(this);
        listView.setAdapter(adapter);

        listLogin.add(new Login(R.drawable.ic_notifications_red,"消息中心"));
        listLogin.add(new Login(R.drawable.ic_eyes_on_red_green,"我的关注"));
        listLogin.add(new Login(R.drawable.ic_my_collection_blue,"我的收藏"));
        listLogin.add(new Login(R.drawable.ic_download_dict_light_blue,"上传和下载"));
        listLogin.add(new Login(R.drawable.ic_setting_blue,"设置"));
        listLogin.add(new Login(R.drawable.ic_like_solid_red,"满意度调查"));

        adapter.addData(listLogin);
        adapter.notifyDataSetChanged();



    }
}
