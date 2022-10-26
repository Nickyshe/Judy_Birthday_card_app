package com.example.judybirthdaycardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Sigin_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigin_page);


    }


    public void accountPage(View view) {

        TextView textView = (TextView) findViewById(R.id.account);
        Intent intent = new Intent(getApplicationContext(), CreateAccount.class);
        startActivity(intent);
    }

    public void clickEvent(View v){
        ImageView imageView =(ImageView) findViewById(R.id.arrow_icon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}
