package com.azizah.diagnosagerd;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapterdata extends RecyclerView.Adapter<Adapterdata.RecycleViewHolder> {

    private ArrayList<Apa> movies;
    private Context context;

    public ArrayList<Apa> getData() {
        return movies;
    }

    public Adapterdata(Context context) {
        this.context = context;

    }

    public void setListdata(ArrayList<Apa> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public RecycleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_apaaitu, viewGroup,false);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewHolder recycleViewHolder, final int i) {
        recycleViewHolder.tvName.setText(movies.get(i).getNama());
        recycleViewHolder.tvFrom.setText(movies.get(i).getPenjelasan());

        Glide.with(context).load(movies.get(i).getFoto())
                .into(recycleViewHolder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public class RecycleViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvFrom;
        TextView tvCiri;
        ImageView imgPhoto;

        public RecycleViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.namatvv);
            tvFrom = itemView.findViewById(R.id.biotvv);
            imgPhoto = itemView.findViewById(R.id.imgv);
        }
    }
}
