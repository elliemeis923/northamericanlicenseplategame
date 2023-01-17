package com.example.northamericanlicenseplategame;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class mexicoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico);


        // your code goes here...
        ArrayList<Plate> plates = new ArrayList<>();
        plates.add(new Plate("Aguascalientes", R.drawable.alberta));
        plates.add(new Plate("Baja California", R.drawable.alberta));
        plates.add(new Plate("Baja California Sur", R.drawable.alberta));
        plates.add(new Plate("Campeche", R.drawable.alberta));
        plates.add(new Plate("Chiapas", R.drawable.alberta));
        plates.add(new Plate("Chihuahua", R.drawable.alberta));
        plates.add(new Plate("Coahuila", R.drawable.alberta));
        plates.add(new Plate("Colima", R.drawable.alberta));
        plates.add(new Plate("Durango", R.drawable.alberta));
        plates.add(new Plate("Guanajuato", R.drawable.alberta));
        plates.add(new Plate("Guerrero", R.drawable.alberta));
        plates.add(new Plate("Hidalgo", R.drawable.alberta));
        plates.add(new Plate("Jalisco", R.drawable.alberta));
        plates.add(new Plate("Mexico", R.drawable.alberta));
        plates.add(new Plate("Mexico City", R.drawable.alberta));
        plates.add(new Plate("Michoacan", R.drawable.alberta));
        plates.add(new Plate("Morelos", R.drawable.alberta));
        plates.add(new Plate("Nayarit", R.drawable.alberta));
        plates.add(new Plate("Nuevo Leon", R.drawable.alberta));
        plates.add(new Plate("Oaxaca", R.drawable.alberta));
        plates.add(new Plate("Puebla", R.drawable.alberta));
        plates.add(new Plate("Queretaro", R.drawable.alberta));
        plates.add(new Plate("Quintana Roo", R.drawable.alberta));
        plates.add(new Plate("San Luis Potosi", R.drawable.alberta));
        plates.add(new Plate("Sinaloa", R.drawable.alberta));
        plates.add(new Plate("Sonora", R.drawable.alberta));
        plates.add(new Plate("Tabasco", R.drawable.alberta));
        plates.add(new Plate("Tamaulipas", R.drawable.alberta));
        plates.add(new Plate("Tlaxcala", R.drawable.alberta));
        plates.add(new Plate("Vera Cruz", R.drawable.alberta));
        plates.add(new Plate("Yucatan", R.drawable.alberta));
        plates.add(new Plate("Zacatecas", R.drawable.alberta));

        PlateAdapter adapter = new PlateAdapter(this, plates);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
