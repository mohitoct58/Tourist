package com.example.mohit.tourist.Cities.Chandigarh.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class ChattbirZoo extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Also known as the Mahendra Chaudhary Zoological Park, Chhatbir zoo, the distinguished zoological garden is  located at a distance of 17 km from Chandigarh and 55 km from Patiala. The  zoo sprawls across an expanse of 202 acres against a stunning green backdrop.\n" +
            "\n" +
            "It is indeed a marvel to see how acres of raw scrubland have been transformed into a wonderful home for wild animals. The zoo paints a magnificent picture of the underlying ecological harmony that enhances the charm of the beautiful surroundings. The animals are kept in open enclosures so that their behavioral and physical needs can be met akin to their natural habitat "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattbir_zoo);
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
