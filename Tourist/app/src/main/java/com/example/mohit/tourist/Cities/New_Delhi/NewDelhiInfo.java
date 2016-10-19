package com.example.mohit.tourist.Cities.New_Delhi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.New_Delhi.Places.*;
import com.example.mohit.tourist.R;

public class NewDelhiInfo extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Red Fort","Qutb Minar","Humayun's Tomb",
    "Lotus Temple","Akshardham","India Gate","Laxmi Narayan Temple","Agrasen Ki Baoli"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_delhi_info);
        listView = (ListView)findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent obj;
        switch(i)
        {
            case 0:obj = new Intent(NewDelhiInfo.this, RedFort.class);
                   startActivity(obj);
                   break;
            case 1:obj = new Intent(NewDelhiInfo.this, QutbMinar.class);
                   startActivity(obj);
                   break;
            case 2:obj = new Intent(NewDelhiInfo.this, HumayunTomb.class);
                   startActivity(obj);
                   break;
            case 3:obj = new Intent(NewDelhiInfo.this, LotusTemple.class);
                   startActivity(obj);
                   break;
            case 4:obj = new Intent(NewDelhiInfo.this, Akshardham.class);
                   startActivity(obj);
                   break;
            case 5:obj = new Intent(NewDelhiInfo.this, IndiaGate.class);
                   startActivity(obj);
                   break;
            case 6:obj = new Intent(NewDelhiInfo.this, LaxmiNarayanTemple.class);
                   startActivity(obj);
                   break;
            case 7:obj = new Intent(NewDelhiInfo.this, AgrasenKiBaoli.class);
                   startActivity(obj);
                   break;
        }
    }
}
