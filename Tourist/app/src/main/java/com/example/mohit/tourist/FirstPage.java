package com.example.mohit.tourist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mohit.tourist.Cities.Bangalore.BangaloreInfo;
import com.example.mohit.tourist.Cities.Chandigarh.ChandigarhInfo;
import com.example.mohit.tourist.Cities.Hyderabad.HyderabadInfo;
import com.example.mohit.tourist.Cities.New_Delhi.NewDelhiInfo;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }
    public void delhi(View x)
    {
        Intent obj = new Intent(FirstPage.this, NewDelhiInfo.class);
        startActivity(obj);
    }
    public void chandigarh(View x)
    {
        Intent obj = new Intent(FirstPage.this, ChandigarhInfo.class);
        startActivity(obj);
    }
    public void hyderabad(View x)
    {
        Intent obj = new Intent(FirstPage.this, HyderabadInfo.class);
        startActivity(obj);
    }
    public void bangalore(View x)
    {
        Intent obj = new Intent(FirstPage.this, BangaloreInfo.class);
        startActivity(obj);
    }
}
