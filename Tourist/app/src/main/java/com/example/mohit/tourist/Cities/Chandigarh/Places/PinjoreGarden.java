package com.example.mohit.tourist.Cities.Chandigarh.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class PinjoreGarden extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Also known as the Yadavindra Gardens, the Pinjore gardens were created by a Nawab under the Mughal emperor Aurangzeb. The garden was expanded and reconstructed by the Maharaja Yadavindra of the State of Patiala. The garden houses several palatial structures that display a distinct blend of the Rajasthani and Mughal styles of architecture."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjore_garden);
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
