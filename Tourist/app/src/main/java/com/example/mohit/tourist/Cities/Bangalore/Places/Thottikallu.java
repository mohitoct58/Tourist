package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class Thottikallu extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Also known as Swarna Mukhi falls with the word swarna Mukhi meaning Golden face, these are situated off the Kanakapura Road. The name itself implies the mesmerizing beauty that these falls boasts of. Thottikallu Falls are also popular as the TK falls.\n" +
            "\n" +
            "To enjoy the real charm of these falls, one must visit immediately after or during monsoon season as in summer season, water of fall dries up to a large extent. If you want to sit and just bask in the beauty of this fall then you can sit at one of the many rocks here. You will find various rocks near the fall.\n" +
            "\n" +
            "Not just the scenic beauty, there is a shrine as well near the fall, which attracts many visitors. The Muneshwara Temple which is situated under a huge tree is at the entrance of the TK falls. It is also a peaceful site to spend a few moments. The lush green surroundings make it all the more spiritual. The place is also good for trekking and walks. You can trek through forest and rocks. Do keep enough water and food if you plan to go trekking."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thottikallu);
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
