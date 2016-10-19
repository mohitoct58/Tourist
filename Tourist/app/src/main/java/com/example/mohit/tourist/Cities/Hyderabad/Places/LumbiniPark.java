package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class LumbiniPark extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"One of the famous Hyderabad tourist places, Lumbini Park Hyderabad was developed by the Hyderabad Urban Development Authority in the year of 1994. Perfect place for relaxation and amusement, Lumbini Park has been named after birthplace of Siddhartha who later came to be known as Lord Buddha. The park is part of the Buddha Purnima project of Hyderabad Urban Development Authority. After the later Chief Minister of Andhra Pradesh, this park was renamed at the T. Anjaiah Lumbini Park in the year of 2006. However, popularly it is still known by the name of Lumbini Park. Situated quite close to the famous standing statue of Lord Buddha and Hussain Sagar Lake, the largest artificial lake of Asia, the Lumbini Park is a place worth visiting. An apt place for relaxation, this park is visited by everyone. It is quite popular among kids. For kids, there are fun rides. It is more like a mini entertainment park right in the middle of the city, by the side of an beautiful lake."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lumbini_park);
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
