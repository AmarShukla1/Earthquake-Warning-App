package com.example.udacitycourseapplication;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recylerviewadapter extends RecyclerView.Adapter<Recylerviewadapter.RecyclerviewHolder> {
    private List<String> texts;
    public Recylerviewadapter(List<String> texts) {
        this.texts = texts;
    }

    @NonNull
    @Override
    public RecyclerviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView textview= (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new RecyclerviewHolder(textview);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerviewHolder holder, int position) {
        String fruitName=texts.get(position);
        holder.fruitName.setText(fruitName);
    }

    @Override
    public int getItemCount() {
        return texts.size();
    }
    public static class RecyclerviewHolder extends RecyclerView.ViewHolder
    {
        public TextView fruitName;


        public RecyclerviewHolder(@NonNull TextView itemView) {
            super(itemView);
            fruitName=itemView;
        }
    }
}

