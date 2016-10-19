package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class Charminar extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"The Charminar was built in 1591 by Mohammed Quli Qutub Shah, the fifth sultan of the Qutub Shahi dynasty of India. There are varying legends as to why he built the magnificent structure. One account says that the sultan built it in honor of his wife, Bhagyamathi (or Bhagmathi), together with the construction of Hyderabad itself. Another, more popular, legend is that the sultan built it to honor a promise to Allah when he prayed for an end to a plague that ravaged the new city. The building got its name from its four minarets, which were possibly meant to honor the first four caliphs of Islam. Another legend also holds that a secret tunnel runs underneath the monument that connects the palace at Golconda to it should the royal family need to escape but so far, no such tunnels have been found. The Charminar is in a square shape, with the four minarets in each of the corners. The sides measure 20 meters each, and the minarets stand at a height of 48.7 meters from the ground. Every side of the Charminar opens into a plaza and through giant arches that overlook four major thoroughfares. The arches also dwarf the other features of the building except the minarets, and these could be the reason why the Charminar was given its other nickname. The minarets, on the other hand, have four stories each, marked by a carved ring. There are 149 winding steps inside each, which the visitor can use to climb up in order to glimpse a breathtaking view of the city. At the western end of the Charminar’s roof is a mosque–the oldest in Hyderabad. Atop the building are 45 prayer spaces where the devout can worship. The first floor has beautiful balconies where one can also get a fantastic view of the city."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charminar);
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
