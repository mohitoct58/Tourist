package com.example.mohit.tourist.Cities.New_Delhi.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class Akshardham extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Swaminarayan Akshardham in New Delhi epitomizes 10,000 years of Indian culture in all its breathtaking grandeur, beauty, wisdom an d bliss. It brilliantly showcases the essence of India’s ancient architecture, traditions and timeless spiritual messages. The Akshardham experience is an enlightening journey through India’s glorious art, values and contributions for the progress, happiness and harmony of mankind.\n" +
            "\n" +
            "The Swaminarayan Akshardham complex was built in only five years through the blessings of HDH Pramukh Swami Maharaj of the Bochasanwasi Shri Akshar Purushottam Swaminarayan Sanstha (BAPS) and the colossal devotional efforts of 11,000 artisans and thousands of BAPS volunteers. Heralded by the Guinness World Record as the World’s Largest Comprehensive Hindu Temple, the complex was inaugurated on 6 November, 2005."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akshardham);
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
