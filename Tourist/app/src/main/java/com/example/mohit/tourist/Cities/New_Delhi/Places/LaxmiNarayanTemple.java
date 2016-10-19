package com.example.mohit.tourist.Cities.New_Delhi.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class LaxmiNarayanTemple extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Laxmi Narayan Temple, also known as Birla Mandir, is one of Delhi's major temples and a major tourist attraction. Built by the industrialst Sh. J.K. Birla in 1939, this beautiful temple is located in the west of Connaught Place.\n" +
            "\n" +
            "Birla Mandir\n" +
            "The temple is dedicated to Laxmi (the goddess of prosperity) and Narayana (The preserver). The temple was inaugurated by Mahatma Gandhi on the condition that people of all castes will be allowed to enter the temple. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laxmi_narayan_temple);
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
