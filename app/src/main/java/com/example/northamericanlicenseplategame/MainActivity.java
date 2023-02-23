package com.example.northamericanlicenseplategame;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int countTotal;

    @SuppressLint("SetTextI18n")
    @Override
      protected void onResume() {
        super.onResume();
        SharedPreferences shu = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences shm = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences shc = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        countTotal = shu.getInt("cu", 0);
        countTotal += shc.getInt("cc", 0);
        countTotal += shm.getInt("cm", 0);
        TextView tv =  findViewById(R.id.percent_total);
        tv.setText(countTotal + "/95");
    }

    public int loadCount(){
        SharedPreferences shu = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences shm = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences shc = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        countTotal = shu.getInt("cu", 0);
        countTotal += shc.getInt("cc", 0);
        countTotal += shm.getInt("cm", 0);
        return countTotal;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv =  findViewById(R.id.percent_total);
        tv.setText(loadCount() + "/95");

        Button us = findViewById(R.id.us);

        // The code in this method will be executed when the numbers View is clicked on.
        us.setOnClickListener(view -> {
            Intent usIntent = new Intent(MainActivity.this, usActivity.class);
            startActivity(usIntent);
        });

        Button canada = findViewById(R.id.canada);

        // The code in this method will be executed when the numbers View is clicked on.
        canada.setOnClickListener(view -> {
            Intent canadaIntent = new Intent(MainActivity.this, canadaActivity.class);
            startActivity(canadaIntent);
        });

        Button mexico = findViewById(R.id.mexico);

        // The code in this method will be executed when the numbers View is clicked on.
        mexico.setOnClickListener(view -> {
            Intent mexicoIntent = new Intent(MainActivity.this, mexicoActivity.class);
            startActivity(mexicoIntent);
        });




    }
}

