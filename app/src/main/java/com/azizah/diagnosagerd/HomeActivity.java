package com.azizah.diagnosagerd;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportActionBar().hide();

        BottomNavigationView navigationView = findViewById(R.id.navbt);
        navigationView.setOnNavigationItemSelectedListener(selectedListener);

        Homefragment fg1 = new Homefragment();
        FragmentTransaction fr1 = getSupportFragmentManager().beginTransaction();
        fr1.replace(R.id.layar, fg1, "");
        fr1.commit();


    }

    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.navhome:
                            Homefragment fg1 = new Homefragment();
                            FragmentTransaction fr1 = getSupportFragmentManager().beginTransaction();
                            fr1.replace(R.id.layar, fg1, "");
                            fr1.commit();

                            return true;

                        case R.id.Perbe:
                            PerbedaanGerd fg2 = new PerbedaanGerd();
                            FragmentTransaction fr2 = getSupportFragmentManager().beginTransaction();
                            fr2.replace(R.id.layar, fg2, "");
                            fr2.commit();

                            return true;
                        case R.id.menang:
                            MengatasiFrag fg3 = new MengatasiFrag();
                            FragmentTransaction fr3 = getSupportFragmentManager().beginTransaction();
                            fr3.replace(R.id.layar, fg3, "");
                            fr3.commit();

                            return true;

                        case R.id.navper:
                            Pemeriksaan fg4 = new Pemeriksaan();
                            FragmentTransaction fr4 = getSupportFragmentManager().beginTransaction();
                            fr4.replace(R.id.layar, fg4, "");
                            fr4.commit();

                            return true;




                    }

                    return false;
                }
            };
}
