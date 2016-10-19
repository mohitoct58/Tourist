package com.example.mohit.tourist.Cities.Chandigarh.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class RockGarden extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"The name refers to a sculpture garden located near Sukhna Lake. The Rock garden is also known by the name Nek Chand’s Rock Garden after its founder. Nek Chand was a former government official who started cultivating this garden secretly in his spare time. He kept it hidden from the government authorities for 18 years, till 1975. The garden features several interlinked causeways that run along the waterfalls of the Sukhna Lake and is landscaped with pottery and sculptures of dancers, animals and musicians."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_garden);
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
