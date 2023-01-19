package com.example.northamericanlicenseplategame;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mexicoActivity extends AppCompatActivity {

    ArrayList<Plate> plates = new ArrayList<>();


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


    }

    public void countDone(View view) {
        int count = 0;
        CheckBox cb = (CheckBox) findViewById(R.id.check_view);
        for (int i = 0; i < plates.size(); i++) {
            boolean isChecked = cb.isChecked();
            if (cb.isChecked()) {
                count++;
            }
            TextView tv = (TextView) findViewById(R.id.percent);
            tv.setText(count + "/32");

        }


    }
}