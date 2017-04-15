package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SAKET MAYANK on 17-06-2016.
 */
public class Chooselocation extends AppCompatActivity implements View.OnClickListener {

    CardView delhi,chennai,banglore;
    TextView tv1,tv2,tv3;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooselocation);

        delhi=(CardView)findViewById(R.id.delhi);
        chennai=(CardView)findViewById(R.id.chennai);
        banglore=(CardView)findViewById(R.id.banglore);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        back=(ImageView)findViewById(R.id.back);

        delhi.setOnClickListener(this);
        chennai.setOnClickListener(this);
        banglore.setOnClickListener(this);





        back.setOnClickListener(new CardView.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Chooselocation.this,MainActivity.class);
                startActivity(intent);
            }
        });





    }


    @Override
    public void onClick(View v) {

        String a= tv1.getText().toString();
        String b=tv2.getText().toString();
        String c= tv3.getText().toString();
        Intent intent = new Intent(this,MainActivity.class);
        int id= v.getId();
        switch (id)
        {
            case R.id.delhi:
                intent.putExtra("Text",a);
                startActivity(intent);
                break;
            case R.id.chennai:
                intent.putExtra("Text",b);
                startActivity(intent);
                break;
            case R.id.banglore:
                intent.putExtra("Text",c);
                startActivity(intent);
                break;

        }
    }
}