package com.example.mohit.tourist.Cities.New_Delhi.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class RedFort extends AppCompatActivity{
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"The Red sandstone walls of the massive Red Fort (Lal Qila) rise 33-m above the clamour of Old Delhi as a reminder of the magnificent power and pomp of the Mughal emperors. The walls, built in 1638, were designed to keep out invaders, now they mainly keep out the noise and confusion of the city.\n" +
            "\n" +
            "The main gate, Lahore Gate, is one of the emotional and symbolic focal points of the modern Indian nation and attracts a major crowd on each Independence Day.\n" +
            "        \n" +
            "The vaulted arcade of Chatta Chowk, a bazaar selling tourist trinkets, leads into the huge fort compound. Inside is a veritable treasure trove of buildings, including the Drum House, the Hall of Public Audiences, the white marble Hall of Private Audiences, the Pearl Mosque, Royal Baths and Palace of Color.\n" +
            "\n" +
            "An evening sound and light show re-creates events in India's history connected with the fort."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_fort);
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
