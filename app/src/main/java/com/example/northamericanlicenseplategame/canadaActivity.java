package com.example.northamericanlicenseplategame;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class canadaActivity extends AppCompatActivity {


    ArrayList<Plate> plates = new ArrayList<>();
    ArrayList<Plate> checkPlates = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        // your code goes here...
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

        //turn object to string
        Gson gson = new Gson();
        String json = gson.toJson(checkPlates);

        //turn string back to object
        Type checkPlateType = new TypeToken<ArrayList<Plate>>(){}.getType();
        ArrayList<Plate> plate2 = gson.fromJson(json, checkPlateType);

        // Retrieving the value using its keys the file name
        // must be same in both saving and retrieving the data
        SharedPreferences sh = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        // The value will be default as empty string because for
        // the very first time when the app is opened, there is nothing to show
        String s1 = sh.getString("percent", "0/13");
        boolean e = sh.getBoolean("checked", false);

        TextView percent = findViewById(R.id.percent_canada);
        percent.setText(s1);
        CheckBox cb =  findViewById(R.id.check_view);
        cb.setChecked(e);

    }

    public void save(View view){
        CheckBox cb =  findViewById(R.id.check_view);
        TextView percent = findViewById(R.id.percent_canada);

        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        // Creating an Editor object to edit(write to the file)
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // Storing the key and its value as the data fetched from edittext
        myEdit.putString("percent", percent.getText().toString());
        myEdit.putBoolean("checked", cb.isChecked());

        // Once the changes have been made,
        // we need to commit to apply those changes made,
        // otherwise, it will throw an error
        myEdit.apply();
    }

    public void countDone(View view) {
        int count = 0;
        CheckBox cb =  findViewById(R.id.check_view);
        for (int i = 0; i < plates.size(); i++) {
            boolean checked = cb.isChecked();
            if (checked) {
                checkPlates.add(plates.get(i));
            }
            else{
                checkPlates.remove(plates.get(i));
            }
            count = checkPlates.size();
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(count/13  + "/13");//why do we have to divide count by 32??????

        }

    }
}