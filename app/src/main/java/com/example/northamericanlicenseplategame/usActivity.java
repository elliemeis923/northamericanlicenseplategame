package com.example.northamericanlicenseplategame;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class usActivity extends AppCompatActivity {

    ArrayList<Plate> plates = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);

        // your code goes here...

        plates.add(new Plate("Alabama", R.drawable.alabama_license));
        plates.add(new Plate("Alaska", R.drawable.alaska_license_thumb));
        plates.add(new Plate("Arizona", R.drawable.arizona_license_thumb));
        plates.add(new Plate("Arkansas", R.drawable.arkansas_license_thumb));
        plates.add(new Plate("California", R.drawable.california_license_thumb));
        plates.add(new Plate("Colorado", R.drawable.colorado_license_thumb));
        plates.add(new Plate("Connecticut", R.drawable.connecticut_license_thumb));
        plates.add(new Plate("Delaware", R.drawable.delaware_license_thumb));
        plates.add(new Plate("Florida", R.drawable.florida_license_thumb));
        plates.add(new Plate("Georgia", R.drawable.georgia_license_thumb));
        plates.add(new Plate("Hawaii", R.drawable.hawaii_license_thumb));
        plates.add(new Plate("Idaho", R.drawable.idaho_license_thumb));
        plates.add(new Plate("Illinois", R.drawable.illinois_license_thumb));
        plates.add(new Plate("Indiana", R.drawable.indiana_license_thumb));
        plates.add(new Plate("Iowa", R.drawable.iowa_license_thumb));
        plates.add(new Plate("Kansas", R.drawable.kansas_license_thumb));
        plates.add(new Plate("Kentucky", R.drawable.kentucky_license_thumb));
        plates.add(new Plate("Louisiana", R.drawable.louisiana_license_thumb));
        plates.add(new Plate("Maine", R.drawable.maine_license_thumb));
        plates.add(new Plate("Maryland", R.drawable.maryland_license_thumb));
        plates.add(new Plate("Massachusetts", R.drawable.massachusetts_license_thumb));
        plates.add(new Plate("Michigan", R.drawable.michigan_license_thumb));
        plates.add(new Plate("Minnesota", R.drawable.minnesota_license_thumb));
        plates.add(new Plate("Mississippi", R.drawable.mississippi_license_thumb));
        plates.add(new Plate("Missouri", R.drawable.missouri_license_thumb));
        plates.add(new Plate("Montana", R.drawable.montana_license_thumb));
        plates.add(new Plate("Nebraska", R.drawable.nebraska_license_thumb));
        plates.add(new Plate("Nevada", R.drawable.nevada_license_thumb));
        plates.add(new Plate("New Hampshire", R.drawable.newhampshire_license_thumb));
        plates.add(new Plate("New Jersey", R.drawable.newjersey_license_thumb));
        plates.add(new Plate("New Mexico", R.drawable.newmexico_license_thumb));
        plates.add(new Plate("New York", R.drawable.newyork_license_thumb));
        plates.add(new Plate("North Carolina", R.drawable.northcarolina_license_thumb));
        plates.add(new Plate("North Dakota", R.drawable.northdakota_license_thumb));
        plates.add(new Plate("Ohio", R.drawable.ohio_license_thumb));
        plates.add(new Plate("Oklahoma", R.drawable.oklahoma_license_thumb));
        plates.add(new Plate("Oregon", R.drawable.oregon_license_thumb));
        plates.add(new Plate("Pennsylvania", R.drawable.pennsylvania_license_thumb));
        plates.add(new Plate("Rhode Island", R.drawable.rhodeisland_license_thumb));
        plates.add(new Plate("South Carolina", R.drawable.southcarolina_license_thumb));
        plates.add(new Plate("South Dakota", R.drawable.southdakota_license_thumb));
        plates.add(new Plate("Tennessee", R.drawable.tennessee_license_thumb));
        plates.add(new Plate("Texas", R.drawable.texas_license_thumb));
        plates.add(new Plate("Utah", R.drawable.utah_license_thumb));
        plates.add(new Plate("Vermont", R.drawable.vermont_license_thumb));
        plates.add(new Plate("Virginia", R.drawable.virginia_license_thumb));
        plates.add(new Plate("Washington", R.drawable.washington_license_thumb));
        plates.add(new Plate("West Virginia", R.drawable.westvirginia_license_thumb));
        plates.add(new Plate("Wisconsin", R.drawable.wisconsin_license_thumb));
        plates.add(new Plate("Wyoming", R.drawable.wyoming_license_thumb));

        PlateAdapter adapter = new PlateAdapter(this, plates);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

    public void countDone(View view) {
        int count = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.check_view);
        for(int i = 0; i < plates.size(); i++) {
            boolean isChecked = cb.isChecked();
            if (cb.isChecked()) {
                count++;
            }
            TextView tv = (TextView) findViewById(R.id.percent_us);
            tv.setText(count + "/50");
        }
    }

}
