package com.example.judybirthdaycardapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
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

    public void openRate(View v) {
        TextView textView = (TextView) findViewById(R.id.app);
        //------THIS WILL RUN ONLY ON DOUBLE CLICK-----

//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
                RelativeLayout open = (RelativeLayout) findViewById(R.id.rate_layout);
                open.setVisibility(RelativeLayout.VISIBLE);
                ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
                bottomNav.setVisibility(ConstraintLayout.INVISIBLE);

//            }
//        });

    }

    public void openFeedbackA(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.star1);
        //------THIS WILL MAKE STAR IMAGE TO CHANGE COLOR ONLY ON DOUBLE CLICK-----
//        imageView.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
                int yellow = Color.parseColor("#FFEB3B");
                imageView.setBackgroundColor(yellow);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.feedback_xml);
                relativeLayout.setVisibility(RelativeLayout.VISIBLE);
                RelativeLayout open = (RelativeLayout) findViewById(R.id.rate_layout);
                open.setVisibility(open.INVISIBLE);
                //-----THIS IS NEEDED NO MORE BECAUSE IT IS ALREADY SET TO INVINCIBLE IN openRate()----
//                ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
//                bottomNav.setVisibility(bottomNav.INVISIBLE);

//            }
//        });

    }

    public void openFeedbackB(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.star_two);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int yellow = Color.parseColor("#FFEB3B");
                imageView.setBackgroundColor(yellow);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.feedback_xml);
                relativeLayout.setVisibility(RelativeLayout.VISIBLE);
                RelativeLayout open = (RelativeLayout) findViewById(R.id.rate_layout);
                open.setVisibility(RelativeLayout.INVISIBLE);
                ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
                bottomNav.setVisibility(ConstraintLayout.INVISIBLE);

            }
        });


    }

    public void openFeedbackC(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.star3);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                int yellow = Color.parseColor("#FFEB3B");
                imageView.setBackgroundColor(yellow);
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.feedback_xml);
                relativeLayout.setVisibility(RelativeLayout.VISIBLE);
                RelativeLayout open = (RelativeLayout) findViewById(R.id.rate_layout);
                open.setVisibility(RelativeLayout.INVISIBLE);
                ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
                bottomNav.setVisibility(ConstraintLayout.INVISIBLE);

            }
        });

    }
    public void openFeedbackD(View v){
        ImageView imageView = (ImageView) findViewById(R.id.star4);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yellow = Color.parseColor("#FFEB3B");
                imageView.setBackgroundColor(yellow);


                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.feedback_xml);
                relativeLayout.setVisibility(RelativeLayout.VISIBLE);
                ConstraintLayout bottomNav = (ConstraintLayout) findViewById(R.id.constraint);
                bottomNav.setVisibility(ConstraintLayout.INVISIBLE);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(
                        "https://play.google.com/store/apps/details?id=com.example.android"));
                intent.setPackage("com.android.vending");
                startActivity(intent);

            }
        });
    }
}