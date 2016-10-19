package com.example.mohit.tourist;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * Created by Mohit on 23/06/2016.
 */
public class Frag extends Fragment{
    TextView t2,t3,t4,t5;
    String s1,s2,s3,s4;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag, container, false);
        t2 = (TextView)v.findViewById(R.id.textView2);
        t3 = (TextView)v.findViewById(R.id.textView3);
        t4 = (TextView)v.findViewById(R.id.textView4);
        t5 = (TextView)v.findViewById(R.id.textView5);
        t2.setText(s1);
        t3.setText(s2);
        t4.setText(s3);
        t5.setText(s4);

        return v;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    public void input(String s1,String s2,String s3,String s4)
    {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }
}
