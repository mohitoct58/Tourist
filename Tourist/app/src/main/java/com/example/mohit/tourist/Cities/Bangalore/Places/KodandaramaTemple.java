package com.example.mohit.tourist.Cities.Bangalore.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class KodandaramaTemple extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Kodandaramaswami Temple\n" +
            "\n" +
            "is a Hindu shrine located at Hiremagalur near Chikkamagaluru, in Chikkamagaluru district, Karnataka, India. The temple deity is called Kodandarama, as Rama, and his brother Lakshmana are depicted holding arrows.\n" +
            "\n" +
            "The temple is State protected and appears to have been constructed in three stages, with its garbhagrha and sukhanasi structures in the Hoysala style. The remaining portions are additions in Dravidian style. The present navaranga is of the 14th century. While the mukhamandapa may be of the 16th century. The outer walls of the garbhagruha and vestibule are raised on a square basement which consists of six cornices. The outer walls of the navaranga and mukhamandapa are built with brick and mortar. The projection of the vestibule appears to be of the 17th century.\n" +
            "In the garbhagrha on a common Hanuman pedestal, 1.5 ft high, there are idols of Kodandarama with Sita to his right and Lakshmana to his left. Rama and Lakshmana carry the arrows in their right hands and strung bows in their left hands. The idols appear to be of a later date and not of the Hoysala period."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodandarama_temple);
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
