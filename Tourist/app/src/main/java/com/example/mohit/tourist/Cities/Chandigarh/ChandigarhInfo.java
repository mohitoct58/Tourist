package com.example.mohit.tourist.Cities.Chandigarh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.Chandigarh.Places.*;
import com.example.mohit.tourist.R;

public class ChandigarhInfo extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Rock Garden","Rose Garden","Pinjore Garden","Chattbir Zoo","Cactus Garden",
    "Le Corbusier Centre","Terraced Garden","International Dolls Museum"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandigarh_info);
        listView = (ListView)findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent obj;
        switch(i)
        {
            case 0:obj = new Intent(ChandigarhInfo.this, RockGarden.class);
                startActivity(obj);
                break;
            case 1:obj = new Intent(ChandigarhInfo.this, RoseGarden.class);
                startActivity(obj);
                break;
            case 2:obj = new Intent(ChandigarhInfo.this, PinjoreGarden.class);
                startActivity(obj);
                break;
            case 3:obj = new Intent(ChandigarhInfo.this, ChattbirZoo.class);
                startActivity(obj);
                break;
            case 4:obj = new Intent(ChandigarhInfo.this, CactusGarden.class);
                startActivity(obj);
                break;
            case 5:obj = new Intent(ChandigarhInfo.this, LeCorbusier.class);
                startActivity(obj);
                break;
            case 6:obj = new Intent(ChandigarhInfo.this, TerracedGarden.class);
                startActivity(obj);
                break;
            case 7:obj = new Intent(ChandigarhInfo.this, DollsMuseum.class);
                startActivity(obj);
                break;
        }
    }
}
