package com.example.mohit.tourist.Cities.Hyderabad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.Hyderabad.Places.*;
import com.example.mohit.tourist.R;

public class HyderabadInfo extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Charminar","Golkonda","Hussain Sagar","Makkah Masjid","Lumbini Park",
    "Shamirpet Lake", "Sanjeevaiah Park","DurgamCheruvu"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad_info);
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
            case 0:obj = new Intent(HyderabadInfo.this, Charminar.class);
                startActivity(obj);
                break;
            case 1:obj = new Intent(HyderabadInfo.this, Golkonda.class);
                startActivity(obj);
                break;
            case 2:obj = new Intent(HyderabadInfo.this, HussainSagar.class);
                startActivity(obj);
                break;
            case 3:obj = new Intent(HyderabadInfo.this, MakkahMasjid.class);
                startActivity(obj);
                break;
            case 4:obj = new Intent(HyderabadInfo.this, LumbiniPark.class);
                startActivity(obj);
                break;
            case 5:obj = new Intent(HyderabadInfo.this, ShamirpetLake.class);
                startActivity(obj);
                break;
            case 6:obj = new Intent(HyderabadInfo.this, SanjeevaiahPark.class);
                startActivity(obj);
                break;
            case 7:obj = new Intent(HyderabadInfo.this, DurgamCheruvu.class);
                startActivity(obj);
                break;
        }
    }
}
