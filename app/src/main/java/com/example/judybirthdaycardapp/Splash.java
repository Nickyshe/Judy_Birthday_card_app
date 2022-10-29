package com.example.judybirthdaycardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.activity_main);
            }
        }, 5000);
    }

    public void open(MenuItem item) {
        ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
        bottomNav.setVisibility(ConstraintLayout.VISIBLE);


    }

    public void siginPage(View v) {

        TextView textView = (TextView) findViewById(R.id.open_signin);
        Intent intent = new Intent(getApplicationContext(), Sigin_Page.class);
        startActivity(intent);


    }






    public void openBirthdayMessage(View view) {
        CardView cardView = (CardView) findViewById(R.id.card1);
        Intent intent = new Intent(getApplicationContext(), BirthdayMessages.class);
    }

    public void openRate(View v){
        TextView textView = (TextView) findViewById(R.id.app);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout open = (RelativeLayout) findViewById(R.id.rate_layout);
                open.setVisibility(RelativeLayout.VISIBLE);
                ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
                bottomNav.setVisibility(ConstraintLayout.INVISIBLE);

            }
        });

    }

    public void openFeedbackA(View v){
      ImageView imageView = (ImageView) findViewById(R.id.star1);
      imageView.setOnClickListener(new View.OnClickListener() {

          @Override
          public void onClick(View view) {



          }
      });

    }


}