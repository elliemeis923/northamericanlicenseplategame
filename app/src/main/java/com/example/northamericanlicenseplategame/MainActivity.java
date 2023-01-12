package com.example.northamericanlicenseplategame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button us = (Button) findViewById(R.id.us);

        us.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent usIntent = new Intent(MainActivity.this, usActivity.class);
                startActivity(usIntent);
            }
        });

        Button canada = (Button) findViewById(R.id.canada);

        canada.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent canadaIntent = new Intent(MainActivity.this, canadaActivity.class);
                startActivity(canadaIntent);
            }
        });

        Button mexico = (Button) findViewById(R.id.mexico);

        mexico.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mexicoIntent = new Intent(MainActivity.this, mexicoActivity.class);
                startActivity(mexicoIntent);
            }
        });

        Button settings = (Button) findViewById(R.id.settings);

        settings.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent settingsIntent = new Intent(MainActivity.this, settingsActivity.class);
                startActivity(settingsIntent);
            }
        });
    }
}