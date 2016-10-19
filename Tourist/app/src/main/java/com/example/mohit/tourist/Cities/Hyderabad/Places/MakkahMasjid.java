package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class MakkahMasjid extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Mecca Masjid is the biggest mosque in Hyderabad and lies 100 yards south-west of Charminar. The name is derived from the Grand Mosque at Mecca on which it is patterned. The hall is 67 metres by 54 metres and 23 metres high. The roof is supported by 15 arches, five on each of the three sides. The western side is blocked by a high hall to provide the Mehrab. At each end are two huge octagonal columns made out of a single piece of granite each and topped by an arched gallery that is crowned by a dome. This mosque is one of the largest in India and can accommodate ten thousand people at a time.\n" +
            "\n" +
            "The building of the Mecca Masjid was begun by Sultan Mohammed Quth Shah under the direction of Daroga Mir Faizullah Baig and Choudhary Rangaiah. Nearly 8000 masons and labourers worked on it. The construction work continued during the reigns of Abdullah Qutb Shah and Abul Hasan Tana Shah. Finally 77 years after it was begun, Mecca Masjid was completed in 1694 by the Mughal Emperor Aurangzeb."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makkah_masjid);
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
