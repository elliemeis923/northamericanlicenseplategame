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

    public int countTotal;

    @Override
    protected void onResume() {
        super.onResume();
        countTotal = usActivity.getCount() + mexicoActivity.getCount()  + canadaActivity.getCount();
        TextView tv =  findViewById(R.id.percent_total);
        tv.setText(countTotal + "/92");
    }

   /* public int loadCount(){
        countTotal = usActivity.calculateCount() + mexicoActivity.calculateCount() + canadaActivity.calculateCount();
        return countTotal;
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* loadCount();*/
        countTotal = usActivity.getCount() + mexicoActivity.getCount()  + canadaActivity.getCount();
        TextView tv =  findViewById(R.id.percent_total);
        tv.setText(countTotal + "/92");

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




    }
}

