package com.example.northamericanlicenseplategame;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class canadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        // your code goes here...
        ArrayList<Plate> plates = new ArrayList<>();
        plates.add(new Plate("Alberta", R.drawable.alberta));
        plates.add(new Plate("British Columbia", R.drawable.british_columbia));
        plates.add(new Plate("Manitoba", R.drawable.manitoba));
        plates.add(new Plate("New Brunswick", R.drawable.new_brunswick));
        plates.add(new Plate("Newfoundland and Labrador", R.drawable.nfl));
        plates.add(new Plate("Northwest Territories", R.drawable.nt));
        plates.add(new Plate("Nova Scotia", R.drawable.nova_scotia));
        plates.add(new Plate("Nunavut", R.drawable.nunavut));
        plates.add(new Plate("Ontario", R.drawable.ontario));
        plates.add(new Plate("Prince Edward Island", R.drawable.pei));
        plates.add(new Plate("Quebec", R.drawable.quebec));
        plates.add(new Plate("Saskatchewan", R.drawable.saskatchewan));
        plates.add(new Plate("Yukon", R.drawable.yukon));

        PlateAdapter adapter = new PlateAdapter(this, plates);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
