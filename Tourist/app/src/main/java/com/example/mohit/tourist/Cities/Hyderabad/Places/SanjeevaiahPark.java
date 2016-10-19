package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class SanjeevaiahPark extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Since Sanjeevaiah Park is located in the heart of Hyderabad, it is easily accessible to all visitors coming from different parts of the city. The park covers an area of 92 acres and is situated along the banks of Hussain Sagar Lake. The name of the park was derived after the name of the former President of India, Dr. Neelam Sanjeeva Reddy. The park is currently managed and maintained by the Hyderabad Metropolitan Development Authority. It also bagged the Best Open Landscape Award at a prestigious award ceremony held during 2010, in the Indian National Trust for Art and Cultural Heritage category. The beautiful sight of the lake mesmerizes its visitors. You may even chance upon black and white striped moorhens here. Sanjeevaiah Park is considered to be the oldest and the largest park in Hyderabad. It is the perfect place for visitors to relax on the lawn and also enjoy a great family picnic. A separate walk way has been paved for visitors to enjoy strolls or jogs at the park. Scroll further for more information about Sanjeevaiah Park in Hyderabad. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjeevaiah_park);
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
