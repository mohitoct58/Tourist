package com.example.mohit.tourist.Cities.New_Delhi.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class AgrasenKiBaoli extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Agrasen Ki Baoli, central Delhi’s oldest monument, remains one the best preserved baolis of Delhi. It is located in the narrow Hailey Lane, off Hailey Road, near Connaught Place, New Delhi. With Jantar Mantar less than 1.5 KM away and India Gate about 2 KM away, Agrasen Ki Baoli remains one of the most easily accessible baolis of Delhi. The monument remains open from 7 AM to 6 PM and the entry is free.\n" +
            "\n" +
            "Even though it can be reached easily, Agrasen Ki Baoli remains hidden among the tall buildings, residential societies and bungalows on the periphery of Connaught Place. Photos from the 1920s show vast expanse of open land around the baoli. But today Agrasen Ki Baoli will only reveal itself to the inquisitive. It is not wonder that many people, who have worked for years in the vicinity, still do not know the exact location of the baoli."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrasen_ki_baoli);
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
