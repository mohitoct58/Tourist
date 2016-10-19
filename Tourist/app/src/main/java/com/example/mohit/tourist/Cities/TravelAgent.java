package com.example.mohit.tourist.Cities;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mohit.tourist.DataBase;
import com.example.mohit.tourist.Frag;
import com.example.mohit.tourist.R;

public class TravelAgent extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView list;
    ArrayAdapter ad;
    Cursor result;
    String s1="",s2="",s3="",s4="";
    String[] names;
    String[] addresses;
    String[] contacts;
    String[] websites;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_agent);
        DataBase db = new DataBase(this);
        list = (ListView)findViewById(R.id.lv);

        result = db.fetch();

        while(result.moveToNext())
        {
            s1 += result.getString(0)+"\n";
            s2 += result.getString(1)+"\n";
            s3 += result.getString(2)+"\n";
            s4 += result.getString(3)+"\n";
        }
        names = s1.split("\n");
        addresses = s2.split("\n");
        contacts = s3.split("\n");
        websites = s4.split("\n");
        ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        list.setAdapter(ad);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Frag f = new Frag();
        switch(i)
        {
            case 0:f.input(names[0],addresses[0],contacts[0],websites[0]);
                   break;
            case 1:f.input(names[1],addresses[1],contacts[1],websites[1]);
                   break;
            case 2:f.input(names[2],addresses[2],contacts[2],websites[2]);
                   break;
            case 3:f.input(names[3],addresses[3],contacts[3],websites[3]);
                   break;
            case 4:f.input(names[4],addresses[4],contacts[4],websites[4]);
                   break;
            case 5:f.input(names[5],addresses[5],contacts[5],websites[5]);
                   break;
            case 6:f.input(names[6],addresses[6],contacts[6],websites[6]);
                   break;
            case 7:f.input(names[7],addresses[7],contacts[7],websites[7]);
                   break;
        }
        FragmentManager m = getFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        t.replace(R.id.rl,f);
        t.remove(f);
        t.add(R.id.rl,f,"1");
        t.commit();
    }
}
