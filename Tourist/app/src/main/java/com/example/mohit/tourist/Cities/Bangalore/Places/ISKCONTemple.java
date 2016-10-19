package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class ISKCONTemple extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"ISKCON stands for International Society for Krishna Consciousness. Srila Prabhupada who went to the United States of America in the year 1966 to spread the message of Krishna and engage people in the practice of the yuga-dharma (chanting of the holy names of Krishna) established this society in 1967.\n" +
            "\n" +
            "All that he carried with him was a trunk full of copies of Srimad Bhagavatam written by him, an umbrella and forty rupees (which was the equivalent of $7 at that time). He operated from a store front in New York on 26, II Avenue and regularly gave classes on verses from Bhagavad-gita. With the help of some of his initial followers, Srila Prabhupada incorporated this society with the vision of developing it into a world-wide organization."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iskcontemple);
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
