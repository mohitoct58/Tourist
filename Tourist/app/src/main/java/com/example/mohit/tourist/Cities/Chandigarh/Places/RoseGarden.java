package com.example.mohit.tourist.Cities.Chandigarh.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class RoseGarden extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Spread over 30 acres the Zakir Hussain Rose Garden is the largest botanical garden in Asia that is dedicated to roses. The garden is named after Zakir Hussain the former President of India. Apart from roses the garden also features several verities of medicinal herbs."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rose_garden);
        listView = (ListView)findViewById(R.id.listView2);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(arrayAdapter);
    }
    public void click(View v)
    {
        Intent obj = new Intent(this,TravelAgent.class);
        startActivity(obj);
    }
}

