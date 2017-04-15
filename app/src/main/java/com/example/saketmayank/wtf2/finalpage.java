package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class finalpage extends AppCompatActivity {
    ImageView home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalpage);
        home=(ImageView)findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(finalpage.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
