package com.azizah.diagnosagerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Animation spalsh;
    ImageView logo, bub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        logo = findViewById(R.id.imageView);
        bub = findViewById(R.id.imageView2);
        spalsh = AnimationUtils.loadAnimation(this, R.anim.spalsh);
        logo.startAnimation(spalsh);
        bub.startAnimation(spalsh);
        getSupportActionBar().hide();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gotohome = new Intent(MainActivity.this, HomeActivity.class );
                startActivity(gotohome);
                finish();
            }
        }, 2000);
    }
}
