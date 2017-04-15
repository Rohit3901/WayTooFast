package com.example.saketmayank.wtf2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAKET MAYANK on 21-06-2016.
 */
public class RecyclerViewActivity extends Activity {
    private List<FoodPlace> foodplaces;
    private RecyclerView rv;
    TextView name,no,min;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mall_name);

        name=(TextView)findViewById(R.id.name);
        rv=(RecyclerView)findViewById(R.id.rv1);
        no=(TextView)findViewById(R.id.no);
        min=(TextView)findViewById(R.id.min);

        Intent i= getIntent();
        String b= i.getStringExtra("MName");
        name.setText(b);



        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        foodplaces = new ArrayList<>();
        String mallname= name.getText().toString();
        if(mallname.equals("Inorbit Mall"))
        {
            foodplaces.add(new FoodPlace("KFC", R.drawable.filter,R.drawable.person,"5","6"));
            foodplaces.add(new FoodPlace("DOMINOS", R.drawable.filter,R.drawable.person,"7","5"));
            foodplaces.add(new FoodPlace("KING BURGER", R.drawable.filter,R.drawable.person,"6","8"));
            foodplaces.add(new FoodPlace("PIZZA HUT", R.drawable.filter,R.drawable.person,"2","10"));

        }
        else if(mallname.equals("Pacific Mall"))
        {
            foodplaces.add(new FoodPlace("FOOD COURT", R.drawable.filter,R.drawable.person,"4","5"));
            foodplaces.add(new FoodPlace("DOMINOS", R.drawable.filter,R.drawable.person,"6","7"));
            foodplaces.add(new FoodPlace("KING BURGER", R.drawable.filter,R.drawable.person,"3","4"));
            foodplaces.add(new FoodPlace("AMERICAN PIZZA", R.drawable.filter,R.drawable.person,"5","6"));
        }
        else if(mallname.equals("Crossroad Mall"))
        {
            foodplaces.add(new FoodPlace("KFC", R.drawable.filter,R.drawable.person,"5","6"));
            foodplaces.add(new FoodPlace("DOMINOS", R.drawable.filter,R.drawable.person,"4","5"));
            foodplaces.add(new FoodPlace("SNACKLITE", R.drawable.filter,R.drawable.person,"6","10"));
            foodplaces.add(new FoodPlace("PIZZA 120 ", R.drawable.filter,R.drawable.person,"7","5"));
        }
        else if(mallname.equals("Unix Mall"))
        {
            foodplaces.add(new FoodPlace("FOOD HUT", R.drawable.filter,R.drawable.person,"5","6"));
            foodplaces.add(new FoodPlace("KFC", R.drawable.filter,R.drawable.person,"7","8"));
            foodplaces.add(new FoodPlace("MAC D", R.drawable.filter,R.drawable.person,"3","5"));
            foodplaces.add(new FoodPlace("AMERICAN PIZZA", R.drawable.filter,R.drawable.person,"5","6"));
        }
    }

    private void initializeAdapter(){
        FPAdapter adapter = new FPAdapter(foodplaces);
        rv.setAdapter(adapter);
    }
}



