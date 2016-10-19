package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class Ulsoor extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Ulsoor Lake is situated on the northeastern fringe of the city center, near the busy M. G. Road. The lake was constructed by Kempe Gowda II, during the later half of the second century. Spread over an area of approximately 1.5 square kilometers, the Ulsoor lake of Bangalore is dotted with islands. One of the major attractions of the lake is boating. There is a boat club at the lake, where you can hire cruises with stopovers at some of the islands.\n" +
            "\n" +
            "In the earlier times, Ulsoor Lake was known as \"Halsur\" or \"Alasur\". The lake also serves as the venue for the Ganesha Festival celebrated in August/September. There is a recreational complex situated near the lake, with a swimming pool, where you can go for a swim. There is also a gurdwara near the Ulsoor lake, considered to be the largest Sikh shrine in the Bangalore city of India. The other famous monuments near the lake include a temple dedicated to Subbaraya and the Kensington Park.\n" +
            "\n" +
            "It is said that the area around the Ulsoor Lake was once covered with forest. One day, Kempe Gowda came from Yelahankar chasing game and was very tired. He slept under the same tree where Mandava Rishi is believed to have worshipped God Somesvara. In his dreams, he saw God Somesvara, who told him about a hidden treasure. Kempe Gowda dug up the treasure and from the money, got the famous Somesvara pagoda built in the Dravidian style of architecture. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ulsoor);
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
