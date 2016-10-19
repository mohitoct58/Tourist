package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class PenisularGneiss extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Peninsular Gneiss is a term coined to highlight the older gneissic complex of the metamorphics found all over the Indian Peninsula. This term was first fashioned by W.F.Smeeth of the Mysore Geological Department in 1916 based on the first scientific study of this rock exposure. The Geological Survey of India identified one of the best exposures of this rock mass, protruding high above the ground as a hillock (pictured), dated 2.5 to 3.4 billion years, in the Bangalore city in India at the famous Lalbagh gardens and declared it as a National Geological Monument to propagate the knowledge of the rock formation among the public, since Lalbagh is frequented by visitors from all over the world. It is also called the Lalbagh rock."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penisular_gneiss);
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
