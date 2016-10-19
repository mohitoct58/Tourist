package com.example.mohit.tourist.Cities.Bangalore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.Bangalore.Places.*;
import com.example.mohit.tourist.R;

public class BangaloreInfo extends AppCompatActivity implements ListView.OnItemClickListener{
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"ISKCON Temple","Ulsoor","Kodandarama Temple","Bellandur Lake","Penisular" +
            "Gneiss","Thottikallu","Hebbal Lake","Bugle Rock"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore_info);
        listView = (ListView)findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent obj;
        switch(i)
        {
            case 0:obj = new Intent(BangaloreInfo.this, ISKCONTemple.class);
                startActivity(obj);
                break;
            case 1:obj = new Intent(BangaloreInfo.this, Ulsoor.class);
                startActivity(obj);
                break;
            case 2:obj = new Intent(BangaloreInfo.this, KodandaramaTemple.class);
                startActivity(obj);
                break;
            case 3:obj = new Intent(BangaloreInfo.this, BellandurLake.class);
                startActivity(obj);
                break;
            case 4:obj = new Intent(BangaloreInfo.this, PenisularGneiss.class);
                startActivity(obj);
                break;
            case 5:obj = new Intent(BangaloreInfo.this, Thottikallu.class);
                startActivity(obj);
                break;
            case 6:obj = new Intent(BangaloreInfo.this, HebbalLake.class);
                startActivity(obj);
                break;
            case 7:obj = new Intent(BangaloreInfo.this, BugleRock.class);
                startActivity(obj);
                break;
        }
    }
}
