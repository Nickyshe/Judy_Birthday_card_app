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

    public void open(MenuItem item){
        ConstraintLayout bottomNav=(ConstraintLayout) findViewById(R.id.constraint);
       bottomNav.setVisibility(ConstraintLayout.VISIBLE);



    }

public void siginPage(View v){

      TextView textView=(TextView) findViewById(R.id.open_signin) ;
      Intent intent = new Intent(getApplicationContext(),Sigin_Page.class);
      startActivity(intent);


}
public void arrow(View v){
    ImageView imageView = (ImageView) findViewById(R.id.arrow_icon);
    finish();
}

public void openBirthdayMessage(View view){
    CardView cardView = (CardView) findViewById(R.id.card1);
        Intent intent =new Intent(getApplicationContext(),BirthdayMessages.class);
}


}