package com.example.mohit.tourist;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t = new Thread()
        {
            @Override
            public void run() {
                super.run();
                mp = MediaPlayer.create(MainActivity.this,R.raw.spirit);
                mp.start();
                try
                {
                    sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    mp.stop();
                    Intent o = new Intent(MainActivity.this,FirstPage.class);
                    startActivity(o);
                }
            }
        };
        t.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

