package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class BugleRock extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Bugle Rock is a massive rock in the Basavanagudi area of South Bangalore, in the state of Karnataka. It is an abrupt rise above the ground of peninsular gneiss as the main rock formation and with an assessed age of about 3,000 million years. Bugle Rock has generated wide interest among the scientific community.Kempe Gowda II (who came to power in 1585), the feudal ruler of Bangalore, is credited with building four watchtowers setting limits for Bangalore's expansion, which included a tower on the Bugle Rock (on the southern boundary) as it commands a panoramic view of Bangalore city. It is said that at sunset a sentry would blow the bugle and hold a torch (Kannada:panju) which was visible from the other three watch towers (one on the southern bank of the Kempambudi tank on the west, the second near Ulsoor Lake in the east and the third tower adjoining Ramana Maharshi Ashram on Bellary Road, namely Mekhri Circle in the north). This was done to inform people that everything was safe at that location and to give a warning bugle call to alert the citizens of any intruders into the city."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bugle_rock);
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
