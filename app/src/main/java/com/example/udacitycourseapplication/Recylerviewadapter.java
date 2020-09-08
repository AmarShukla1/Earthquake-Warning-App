package com.example.udacitycourseapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recylerviewadapter extends RecyclerView.Adapter<Recylerviewadapter.RecyclerviewHolder> {
    private List<Earthquake> texts;
    public Recylerviewadapter(List<Earthquake> texts) {
        this.texts = texts;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.row1,parent,false);
        return new RecyclerviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {
        Earthquake eas=texts.get(position);
        holder.mag.setText(eas.getMag());
       holder.loc.setText(eas.getLoc());
        holder.date.setText(eas.getDate());
    }

    @Override
    public int getItemCount() {
        return texts.size();
    }
    public static class RecyclerviewHolder extends RecyclerView.ViewHolder
    {
        public TextView mag,date,loc;
        public RecyclerviewHolder(@NonNull View itemView) {
            super(itemView);
            mag = itemView.findViewById(R.id.magnitude);
            loc = itemView.findViewById(R.id.location);
            date = itemView.findViewById(R.id.time1);
        }
    }
}

