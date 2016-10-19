package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class BellandurLake extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Bellandur Lake is a lake in the suburb of Bellandur in the southeast of the city of Bangalore and is the largest lake in the city. It is a part of Bellandur drainage system that drains the southern and the southeastern parts of the city. The lake is a receptor from three chains of lakes upstream, and has a catchment area of about 148 square kilometres (37,000 acres). Water from this lake flows further east to the Varthur Lake, from where it flows down the plateau and eventually into the Pinakani river basin. Bellandur Lake is a major water body which is located in one of the three main valleys of Bangalore. It forms a part of Ponnaiyar River catchment, and water from Bellandur flows to Varthur Lake, ultimately joining the Pennar River. Currently, most of Bengaluru's treated and untreated sewage is let into this lake, severely polluting it, resulting in a depletion of wildlife in and around the lake.Impact of Urbanization with ongoing to fulfill the requirements and greed of Humans has cost the lake to lose its glory, forcing the fauna which was previously dwelling to change habitats. Residential and Commercial activities in and around the region has resulted in increasing the silt deposition in and the Surrounding location of lake has been major cause for loss of under-ground water recharge."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bellandur_lake);
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
