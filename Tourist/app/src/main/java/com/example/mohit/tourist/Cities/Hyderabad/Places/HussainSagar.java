package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class HussainSagar extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"One of the largest man made lakes is situated at Hyderabad. Its uniqueness lies in the fact that it connects the twin cities of Hyderabad and Secunderabad. A famous monolith of Lord Buddha is installed at the center of the lake. Hussain Sagar Lake is popularly known as the Tank Bund, a major spot of tourist attractions.  The Hussain Sagar was constructed on a tributary of the Musi river by Hussain Shah Wahi during the reign of Ibrahim Quli Qutub Shah in 1562. It is a sprawling artificial lake that holds water perenially. Every Sunday cultural programmes are conducted by the Department of culture in the evenings and admission is free for the public. 16 mtr. tall, 350 tonne (approx.) monolithic Buddha statue is situated in the middle of the Hussain Sagar Lake, silhouetted against the sunset. Totally, it is made of white granite, the largest statues in all over the world. Boating and Water Sports are a regular feature at Hussain Sagar. The yachting and Sailing clubs at the lake are active and the annual regatta draws a good number of sports persons and lay people alike from all around the country. During the regatta competitions, the lake looks picturesque and colourful with the yachts sailing on the shimmering waters. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hussain_sagar);
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
