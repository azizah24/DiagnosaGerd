package com.azizah.diagnosagerd;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class Homefragment extends Fragment {

    LinearLayout apaitu, gejala, tips, bahaya, deteksi, about;

    public Homefragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_homefragment, container, false);

        apaitu = view.findViewById(R.id.apaitu);
        gejala = view.findViewById(R.id.gejala);
        tips = view.findViewById(R.id.tips);
        bahaya = view.findViewById(R.id.bahaya);
        deteksi = view.findViewById(R.id.deteksi);
        about = view.findViewById(R.id.about);

        apaitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Apaitu.class));

            }
        });

        gejala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Gejala.class));
            }
        });

        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Tipslambung.class));
            }
        });

        bahaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Bahayagerd.class));
            }
        });

        deteksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), DiagnosaGerd.class));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), About.class));
            }
        });

        return view;
    }

}
