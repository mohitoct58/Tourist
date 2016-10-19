package com.example.mohit.tourist.Cities.Chandigarh.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class TerracedGarden extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings ={"The Master plan prepared by Le Corbusier was broadly similar to the one prepared by the team of planners led by Albert Mayer and Mathew Novicki except that the shape of the city plan was modified from one with a curving road network to rectangular shape with a grid iron pattern for the fast traffic roads, besides reducing its area for reason of economy. The city plan was conceived as post war ‘Garden City’ wherein vertical and high rise buildings were ruled out, keeping in view the socio economic-conditions and living habits of the people.\n" +
            "\n" +
            "Due to economic constraints, the master plan was to be realized in two phases, catering to a total population of half a million. Phase-I consisting of 30 low density sector spread over an area of 9000 acres (Sector 1 to 30) for 1,50,000 people whereas Phase-II consisting of 17 considerably high density Sectors ( Sectors 31 to 47) spread over an area of 6000 acres for a population of 3,50,000."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terraced_garden);
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
