package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class DurgamCheruvu extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Situated quite close to the Hi-tech City, Durgam Cheruvu is one of the popular sightseeing places of Hyderabad. Presenting captivating scenic beauty, the lake is also known as the ‘Secret Lake’. This can be because of the fact that it is hidden by the surrounding granite rocks. The rock formations surrounding the lake are spread across an area of 63 acres of land and are said to be approximately 2500 million years old.\n" +
            "\n" +
            "Currently it has been developed into a hangout place where people come and spend some time in a relaxed environment by the side of a calm water body. Durgam Cheruvu now has an artificial waterfall and floating fountain which attracts more visitors. It is nothing less than a pleasant wonder to see a calm lake and rocks, beside the concrete buildings of offices and a shopping mall.\n" +
            "\n" +
            "It is said that the lake was used as the source of drinking water for the Golconda Fort. Also called as the ‘Madhapur Lake’, Durgam Cheruvu promises some refreshing moments to each and everyone.\n" +
            "It is a common venue for film shootings, owing to its scenic beauty and unique location. Durgam Cheruvu Lake is surrounded by granite rocks, which is said to be a rare thing not just in India but in all over Asia. Once at the lake, you can try out various kinds of interesting activities. The place has the facilities available for boating, camping as well as trekking. There are varied kinds of boating choices at Durgam cheruvu, ranging from Pedal Boat, mechanised Boat to Water Scooter."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durgam_cheruvu);
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
