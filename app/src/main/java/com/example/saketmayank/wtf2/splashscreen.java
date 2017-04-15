package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class splashscreen extends AppCompatActivity {
    RelativeLayout splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        splash=(RelativeLayout)findViewById(R.id.splash);

        splash.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(splashscreen.this, MainActivity.class);
                startActivity(i);
            }
        }, 6000);
    }
}
