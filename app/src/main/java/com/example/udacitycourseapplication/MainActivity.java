package com.example.udacitycourseapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();
        recyclerview = findViewById(R.id.lets_see);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setHasFixedSize(true);
        //List<String> list= Arrays.asList(getResources().getStringArray(R.array.planets_array));
        Recylerviewadapter adapter=new Recylerviewadapter(earthquakes);
        recyclerview.setAdapter(adapter);
    }
}