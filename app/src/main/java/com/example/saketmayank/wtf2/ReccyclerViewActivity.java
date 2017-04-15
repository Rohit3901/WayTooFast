package com.example.saketmayank.wtf2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SAKET MAYANK on 16-06-2016.
 */
public class ReccyclerViewActivity extends Activity {

    private List<Person> persons;
    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);
        rv=(RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);
           initializeData();
           initializeAdapter();
    }

        private void initializeData(){
            persons = new ArrayList<>();
            persons.add(new Person("Inorbit Mall",  R.drawable.filter));
            persons.add(new Person("Pacific Mall",  R.drawable.filter));
            persons.add(new Person("Crossroad Mall",  R.drawable.filter));
            persons.add(new Person("Unix Mall",  R.drawable.filter));


        }

         private void initializeAdapter(){
             com.example.saketmayank.wtf2.RVAdapter adapter = new com.example.saketmayank.wtf2.RVAdapter(persons);
             rv.setAdapter(adapter);
         }
     }

