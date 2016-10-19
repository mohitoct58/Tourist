package com.example.mohit.tourist.Cities.New_Delhi.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class HumayunTomb extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings ={"Located near the crossing of Mathura road and Lodhi road, this magnificent garden tomb is the first substantial example of Mughal architecture in India.\nIt was built in 1565 A.D. nine years after the death of Humayun, by his senior widow Bega Begam. Inside the walled enclosure the most notable features are the garden squares (chaharbagh) with pathways water channels, centrally located well proportional mausoleum topped by double dome.\n" +
            "\n" +
            "There are several graves of Mughal rulers located inside the walled enclosure and from here in 1857 A.D; Lieutenant Hudson had captured the last Mughal emperor Bahadur Shah II. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humayun_tomb);
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
