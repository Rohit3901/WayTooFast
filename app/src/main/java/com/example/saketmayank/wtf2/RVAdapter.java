package com.example.saketmayank.wtf2;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by SAKET MAYANK on 15-06-2016.
 */
public class RVAdapter extends RecyclerView.Adapter<com.example.saketmayank.wtf2.RVAdapter.PersonViewHolder>
{


    public static class PersonViewHolder extends RecyclerView.ViewHolder
    {
        CardView cv;
        TextView name;
        ImageView photo;

        PersonViewHolder(final View itemView)
        {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.name);
            photo = (ImageView)itemView.findViewById(R.id.photo);
            itemView.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View v) {
                    String a= name.getText().toString();
                    Intent intent= new Intent(v.getContext(),RecyclerViewActivity.class);
                    intent.putExtra("MName",a);
                    v.getContext().startActivity(intent);

                }
            });
        }
    }
    List<Person> persons;


    RVAdapter(List<Person> persons)
    {
        this.persons = persons;
    }


    @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }




    @Override
        public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
             View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview, viewGroup, false);
             PersonViewHolder pvh = new PersonViewHolder(v);
            return pvh;
         }


    @Override
         public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
             personViewHolder.name.setText(persons.get(i).name);

             personViewHolder.photo.setImageResource(persons.get(i).photo);
         }


         @Override
         public int getItemCount() {
             return persons.size();
         }


}
