package com.example.mohit.tourist.Cities.Chandigarh.Places;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.mohit.tourist.Cities.TravelAgent;
import com.example.mohit.tourist.R;
public class CactusGarden extends AppCompatActivity {
    ListView listView;
    ArrayAdapter arrayAdapter;
    String[] strings = {"Situated in sector 5, the Cactus Garden is the biggest garden in Asia which is dedicated to the endangered species. It was named after Dr. JS Sarkaria. The garden has a regional collection of cactus which is grouped under a growth form in some specific genera. There are dozens of species of cactus in the garden in which the most popular one is Opuntias, Ferocactus and other succulent plants which includes Agaves, Echinocereus, Columnar cacti and Mammillarias.\n" +
            "\n" +
            "The only plants which surpass the popularity of the cactus are the roses and the orchids. Since the cactuses are found in specific areas, they drive a lot of attention by people who do not belong to that habitat. There are hundreds of nurseries having these rare plants which a lot of people come to possess. The ones who are at the top in the market sell over millions of cactuses on a yearly basis and in fact South America is visited by a lot of people just for the cactus.\n" +
            "\n" +
            "Several species of bees which specialize in cacti generally pollinate them are called the cactus bees. These bees are generally found lone but there are some species of female bees which make their hives in a few thousand sq feet area and stay there with thousands of others. The pollen from the cactus is used to feed the grub which is not tended by the parents. Some of the cactuses are pollinated by moths, birds or even bats. "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cactus_garden);
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
