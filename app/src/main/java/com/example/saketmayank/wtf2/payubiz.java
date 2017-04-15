package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.saketmayank.wtf2.PayMentGateWay;
import com.example.saketmayank.wtf2.R;

public class payubiz extends AppCompatActivity {

    EditText fname, pnumber, emailAddress;
    TextView rechargeAmt;
    Button Paynow;
    String getAmt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payubiz);
        fname        = (EditText)findViewById(R.id.fname);
        pnumber      = (EditText)findViewById(R.id.pnumber);
        emailAddress = (EditText)findViewById(R.id.emailAddress);
        rechargeAmt  = (TextView)findViewById(R.id.rechargeAmt);
        Paynow       = (Button)findViewById(R.id.Paynow);
        Intent money=getIntent();
        getAmt=money.getStringExtra("amount").toString().trim();
        rechargeAmt.setText(getAmt);
        Paynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String getFname = fname.getText().toString().trim();
                String getPhone = pnumber.getText().toString().trim();
                String getEmail = emailAddress.getText().toString().trim();
                Intent intent = new Intent(getApplicationContext(), PayMentGateWay.class);
                intent.putExtra("FIRST_NAME",getFname);
                intent.putExtra("PHONE_NUMBER",getPhone);
                intent.putExtra("EMAIL_ADDRESS",getEmail);
                intent.putExtra("RECHARGE_AMT",getAmt);

                startActivity(intent);
            }
        });
    }

}