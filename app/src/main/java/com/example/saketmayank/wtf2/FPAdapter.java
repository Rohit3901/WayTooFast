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
 * Created by SAKET MAYANK on 21-06-2016.
 */
public class FPAdapter extends RecyclerView.Adapter<FPAdapter.FoodPlaceViewHolder> {
    public static class FoodPlaceViewHolder extends RecyclerView.ViewHolder
    {


        CardView cv;
        TextView name,no,min;
        ImageView photo,person;

        FoodPlaceViewHolder(View itemView)
        {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.name);
            photo = (ImageView)itemView.findViewById(R.id.photo);
            person=(ImageView)itemView.findViewById(R.id.person) ;
            no=(TextView)itemView.findViewById(R.id.no);
            min=(TextView)itemView.findViewById(R.id.min);

            itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    String a= name.getText().toString();
                    Intent intent = new Intent(v.getContext(),MainActivityFoodName.class);
                   // intent.putExtra("FName",a);
                    v.getContext().startActivity(intent);

                }
            });



        }
    }
    List<FoodPlace> foodplaces;


    FPAdapter(List<FoodPlace> foodplaces)
    {
        this.foodplaces = foodplaces;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }




    @Override
    public FoodPlaceViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview1, viewGroup, false);
       FoodPlaceViewHolder pvh = new FoodPlaceViewHolder(v);
        return pvh;
    }



    @Override
    public void onBindViewHolder(FoodPlaceViewHolder personViewHolder, int i) {
        personViewHolder.name.setText(foodplaces.get(i).name);
        personViewHolder.photo.setImageResource(foodplaces.get(i).photo);
        personViewHolder.person.setImageResource(foodplaces.get(i).person);
        personViewHolder.no.setText(foodplaces.get(i).no);
        personViewHolder.min.setText(foodplaces.get(i).min);
    }


    @Override
    public int getItemCount() {
        return foodplaces.size();
    }


}

