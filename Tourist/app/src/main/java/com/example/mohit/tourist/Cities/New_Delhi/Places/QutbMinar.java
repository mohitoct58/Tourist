package com.example.mohit.tourist.Cities.New_Delhi.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class QutbMinar extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Qutab Minar is a soaring, 73 m-high tower of victory, built in 1193 by Qutab-ud-din Aibak immediately after the defeat of Delhi's last Hindu kingdom. The tower has five distinct storeys, each marked by a projecting balcony and tapers from a 15 m diameter at the base to just 2.5 m at the top. The first three storeys are made of red sandstone; the fourth and fifth storeys are of marble and sandstone. At the foot of the tower is the Quwwat-ul-Islam Mosque, the first mosque to be built in India. An inscription over its eastern gate provocatively informs that it was built with material obtained from demolishing '27 Hindu temples'. A 7 m-high iron pillar stands in the courtyard of the mosque. It is said that if you can encircle it with your hands while standing with your back to it your wish will be fulfilled."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qutb_minar);
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
