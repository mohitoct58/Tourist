package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class HebbalLake extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Hebbal Lake is one of the oldest and most popular lakes in Bangalore. It is well known as a habitat for numerous exotic local and migratory birds. The lake is situated in the northern part of Bangalore, along the Bellary Road. The huge lake covers an area of around 150 acres. The lake also possesses a beautiful garden adjacent to it.\n" +
            "\n" +
            "The lake was under the management of Karnataka State Forest Department. In 2002 the responsibility for managing the lake was handed over to the Lake Development Authority, a non-profit society that was created for managing lakes in the Bangalore region.\n" +
            "The lake was created by Kempe Gowda, the founder of Bangalore, in 1537. It is one of the three lakes that were created by him. Hebbal Lake was formed by damming natural valley systems through the construction of bunds, just as most other lakes and tanks were created within the Bangalore region"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hebbal_lake);
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
