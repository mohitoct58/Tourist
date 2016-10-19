package com.example.mohit.tourist.Cities.Hyderabad.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;

public class Golkonda extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Golconda (sometimes spelled as Golkonda) Fort was the capital of the ancient kingdom of Golconda which flourished in the 14th to 16th century. It is situated 11 kilometers from Hyderabad, the capital of the state of Telangana. With walls ranging from 17 to 34 feet broken by 87 semi-circular bastions, some reaching 60 feet in height, and built on a granite hill that is 400 feet high, it remains one of India’s most magnificent fortress complexes. Even before the kingdom of Golconda rose in prominence, the beginning of the fort was thought to be in 1143, when the Kakatiya Dynasty ruled the region. According to legend, a shepherd boy found an idol in the area. When this was reported to the Kakatiyan king, he ordered a mud fort to be built around it. The fort eventually became known as Golla Konda, which in Tegulu meant Shepherd’s Hill. The area eventually became a heated battleground between three kingdoms, finally culminating in the victory of the Islamic Bahmani Sultanate and the fort became a capital of a major province of the Sultanate. When Quli Qutub Shah declared his independence from the Bahmani Sultanate in 1518, the Qutub Shahi Dynasty arose and Golconda became its seat of power. Over the next couple of decades, successive Qutub Shahi kings expanded the mud fort into a massive and expansive fort of granite, with a circumference that extended to around 5 kilometers. The fort remained to be the dynasty’s capital until it was moved to Hyderabad in 1590. The fort was then expanded to have a 10-kilometer outer wall that enclosed the city."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_golkonda);
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
