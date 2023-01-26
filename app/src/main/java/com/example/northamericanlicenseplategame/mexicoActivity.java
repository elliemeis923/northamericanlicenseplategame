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

public class mexicoActivity extends AppCompatActivity {

    ArrayList<Plate> plates = new ArrayList<>();
    ArrayList<Plate> checkPlates = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico);



        // your code goes here...

        plates.add(new Plate("Aguascalientes", R.drawable.img_1295));
        plates.add(new Plate("Baja California", R.drawable.img_1296));
        plates.add(new Plate("Baja California Sur", R.drawable.img_1297));
        plates.add(new Plate("Campeche", R.drawable.img_1298));
        plates.add(new Plate("Chiapas", R.drawable.img_1299));
        plates.add(new Plate("Chihuahua", R.drawable.img_1300));
        plates.add(new Plate("Coahuila", R.drawable.img_1301));
        plates.add(new Plate("Colima", R.drawable.img_1302));
        plates.add(new Plate("Durango", R.drawable.img_1304));
        plates.add(new Plate("Guanajuato", R.drawable.img_1306));
        plates.add(new Plate("Guerrero", R.drawable.img_1307));
        plates.add(new Plate("Hidalgo", R.drawable.img_1308));
        plates.add(new Plate("Jalisco", R.drawable.img_1309));
        plates.add(new Plate("Mexico", R.drawable.img_1310));
        plates.add(new Plate("Mexico City", R.drawable.img_1303));
        plates.add(new Plate("Michoacan", R.drawable.img_1311));
        plates.add(new Plate("Morelos", R.drawable.img_1312));
        plates.add(new Plate("Nayarit", R.drawable.img_1313));
        plates.add(new Plate("Nuevo Leon", R.drawable.img_1314));
        plates.add(new Plate("Oaxaca", R.drawable.img_1315));
        plates.add(new Plate("Puebla", R.drawable.img_1316));
        plates.add(new Plate("Queretaro", R.drawable.img_1317));
        plates.add(new Plate("Quintana Roo", R.drawable.img_1318));
        plates.add(new Plate("San Luis Potosi", R.drawable.img_1319));
        plates.add(new Plate("Sinaloa", R.drawable.img_1320));
        plates.add(new Plate("Sonora", R.drawable.img_1321));
        plates.add(new Plate("Tabasco", R.drawable.img_1322));
        plates.add(new Plate("Tamaulipas", R.drawable.img_1323));
        plates.add(new Plate("Tlaxcala", R.drawable.img_1324));
        plates.add(new Plate("Vera Cruz", R.drawable.img_1325));
        plates.add(new Plate("Yucatan", R.drawable.img_1326));
        plates.add(new Plate("Zacatecas", R.drawable.img_1327));

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
        String s1 = sh.getString("percent", "0/32");
        boolean e = sh.getBoolean("checked", false);

        TextView percent = findViewById(R.id.percent);
        percent.setText(s1);
        CheckBox cb =  findViewById(R.id.check_view);
        cb.setChecked(e);


    }

    public void save(View view){
        CheckBox cb =  findViewById(R.id.check_view);
        TextView percent = findViewById(R.id.percent);

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
// no loop everything individual

    public void countDone(View view) {
        int count = 0;
        CheckBox cb =  findViewById(R.id.check_view);
        boolean checked = cb.isChecked();

        for(int i = 0; i < plates.size(); i++) {
            if (checked) {
                checkPlates.add(plates.get(i));
            }
            else{
                checkPlates.remove(plates.get(i));
            }
            count = checkPlates.size();
            TextView tv = (TextView) findViewById(R.id.percent);
            tv.setText(count/32 + "/32");//why do we have to divide count by 32??????

        }

    }
}