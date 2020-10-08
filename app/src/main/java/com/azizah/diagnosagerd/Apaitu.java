package com.azizah.diagnosagerd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.ArrayList;

public class Apaitu extends AppCompatActivity {
    RecyclerView recyclerView;
    private Adapterdata adapter;
    private ArrayList<Apa> movies = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apaitu);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Apa itu GERD?");

        if (movies.isEmpty()){

            movies.addAll(Dataapaitu.getListData());
        }
        recyclerView = findViewById(R.id.aparecy);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Adapterdata adapter = new Adapterdata(this);
        adapter.setListdata(movies);
        recyclerView.setAdapter(adapter);
    }
    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

}
