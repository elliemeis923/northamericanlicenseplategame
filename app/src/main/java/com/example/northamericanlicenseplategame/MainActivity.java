package com.example.northamericanlicenseplategame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sh = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        String s1 = sh.getString("percent_total", "0/95");

        TextView percent = findViewById(R.id.percent_total);
        percent.setText(s1);

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
    public void save(View view) {


        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        TextView percent = findViewById(R.id.percent_us);

        // Creating an Editor object to edit(write to the file)
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // Storing the key and its value as the data fetched from edittext
        myEdit.putString("percent", percent.getText().toString());

        // Once the changes have been made,
        // we need to commit to apply those changes made,
        // otherwise, it will throw an error
        myEdit.apply();
    }
}
