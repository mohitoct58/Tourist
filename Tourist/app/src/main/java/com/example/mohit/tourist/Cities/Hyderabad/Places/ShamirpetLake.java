package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class ShamirpetLake extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Shamirpet Lake is a man-made lake located in Ranga Reddy district near Hyderabad, India. It’s located exactly 24 kms north from Secunderabad and it was built during the rule of Nizam Kings during the late 19th century. Shamirpet Lake is very fine looking lake and its serene & calm environs makes it a great place to enjoy a lovely time. Near in the vicinity of Shamirpet Lake we have Deer Park too & the combination of both makes it a natural habitat for deer. Shamirpet Lake is also know as ‘Pedda Cheruvu’.\n" +
            "\n" +
            "Shamirpet Lake lake was dug more than 50 years ago by the Jagirdar of Shamirpet area to serve as the source of water in the near vicinity. Shamirpet Lake was then identified as the point of interest and Andhra Pradesh government took the charge of developing it.\n" +
            "Shamirpet Deer Park, also known as Jawahar Deer Park is the most attracted destination with 128 deer, 15 different species of snakes and birds. This deer park is spread over 80 acres of land.\n" +
            "\n" +
            "Katta Maisamma Temple is located near the lake and its popular during the time of Bonalu festival. Recreation clubs like The Celebrity Club, Aalankrita and The Orange Bowl are located in the nearby area.\n" +
            "\n" +
            "Shamirpet Lake is one of the nearest picnic spot for the people of Hyderabad and on weekends it serves large gatherings of families."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shamirpet_lake);
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
