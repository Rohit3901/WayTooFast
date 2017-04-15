package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CardView location, office, mall, movie;
    TextView tv,op;
    LinearLayout loc;
    String a;
    RelativeLayout rv1,rv2,rv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        office = (CardView) findViewById(R.id.cv1);
        mall = (CardView) findViewById(R.id.cv2);
        movie = (CardView) findViewById(R.id.cv3);
        location = (CardView) findViewById(R.id.cv4);
        loc = (LinearLayout) findViewById(R.id.loc);
        tv = (TextView) findViewById(R.id.textView2);
        rv1=(RelativeLayout)findViewById(R.id.rv1);
        rv2=(RelativeLayout)findViewById(R.id.rv2);
        rv3=(RelativeLayout)findViewById(R.id.rv3);
        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Chooselocation.class);
                startActivity(intent);
            }
        });

        final Intent intent = getIntent();
        a = intent.getStringExtra("Text");
        tv.setText("  " + a);

        /*rv1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Office.class);

                startActivity(i);
            }
        });
*/

        rv2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,ReccyclerViewActivity.class);

                startActivity(i);
            }
        });
       /* rv3.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Movie.class);

                startActivity(i);
            }
        });*/


    }

}








