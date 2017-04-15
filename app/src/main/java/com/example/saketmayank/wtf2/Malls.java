package com.example.saketmayank.wtf2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Malls extends AppCompatActivity {

    TextView name;
    ImageView photo;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);


        name=(TextView)findViewById(R.id.name);

        photo=(ImageView)findViewById(R.id.photo);

        name.setText("Inorbit Mall");

        photo.setImageResource(R.drawable.filter);






    }

}
