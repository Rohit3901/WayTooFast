package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

public class Checkout extends AppCompatActivity implements View.OnClickListener{
    TextView total1, ordertotal;
    Button payNow;
    EditText time;
    String totalprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        payNow=(Button)findViewById(R.id.proceed);
        time=(EditText)findViewById(R.id.editText5);
        total1=(TextView)findViewById(R.id.price);
        ordertotal=(TextView)findViewById(R.id.textView8);
        Intent intent = getIntent();
        totalprice=intent.getStringExtra("Total");
        //String tps=String.valueOf(cs);
        total1.setText(totalprice);
       // String oss=String.valueOf(cs);
        ordertotal.setText(totalprice);
        //String diss=String.valueOf(cs);
        payNow.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String a= total1.getText().toString();
        Intent intent1=new Intent(Checkout.this, payubiz.class);
        intent1.putExtra("amount",a);
        startActivity(intent1);
    }
}
