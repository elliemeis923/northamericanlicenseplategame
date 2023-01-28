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


    public int countCanada = 0;

    public int getCountCanada() {
        return countCanada;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        // your code goes here...
        SharedPreferences sh = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        boolean c1 = sh.getBoolean("1", false);
        CheckBox a = (CheckBox) findViewById(R.id.check_alberta);
        a.setChecked(c1);
        boolean c2 = sh.getBoolean("2", false);
        CheckBox b = (CheckBox) findViewById(R.id.check_bc);
        b.setChecked(c2);
        boolean c3 = sh.getBoolean("3", false);
        CheckBox c = (CheckBox) findViewById(R.id.check_manitoba);
        c.setChecked(c3);
        boolean c4 = sh.getBoolean("4", false);
        CheckBox d = (CheckBox) findViewById(R.id.check_nb);
        d.setChecked(c4);
        boolean c5 = sh.getBoolean("5", false);
        CheckBox e = (CheckBox) findViewById(R.id.check_nfl);
        e.setChecked(c5);
        boolean c6 = sh.getBoolean("6", false);
        CheckBox f = (CheckBox) findViewById(R.id.check_nt);
        f.setChecked(c6);
        boolean c7 = sh.getBoolean("7", false);
        CheckBox g = (CheckBox) findViewById(R.id.check_ns);
        g.setChecked(c7);
        boolean c8 = sh.getBoolean("8", false);
        CheckBox h = (CheckBox) findViewById(R.id.check_nunavut);
        h.setChecked(c8);
        boolean c9 = sh.getBoolean("9", false);
        CheckBox i = (CheckBox) findViewById(R.id.check_ontario);
        i.setChecked(c8);
        boolean c10 = sh.getBoolean("10", false);
        CheckBox j = (CheckBox) findViewById(R.id.check_pei);
        j.setChecked(c10);
        boolean c11 = sh.getBoolean("11", false);
        CheckBox k = (CheckBox) findViewById(R.id.check_quebec);
        k.setChecked(c11);
        boolean c12 = sh.getBoolean("12", false);
        CheckBox l = (CheckBox) findViewById(R.id.check_saska);
        l.setChecked(c12);
        boolean c13 = sh.getBoolean("13", false);
        CheckBox m = (CheckBox) findViewById(R.id.check_yukon);
        m.setChecked(c13);

        String percent = sh.getString("percent", "0/13");
        TextView pC = (TextView) findViewById(R.id.percent_canada);
        pC.setText(percent);


    }
        public void save(View view){
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

            CheckBox a = (CheckBox) findViewById(R.id.check_alberta);
            CheckBox b = (CheckBox) findViewById(R.id.check_bc);
            CheckBox c = (CheckBox) findViewById(R.id.check_manitoba);
            CheckBox d = (CheckBox) findViewById(R.id.check_nb);
            CheckBox e = (CheckBox) findViewById(R.id.check_nfl);
            CheckBox f = (CheckBox) findViewById(R.id.check_nt);
            CheckBox g = (CheckBox) findViewById(R.id.check_ns);
            CheckBox h = (CheckBox) findViewById(R.id.check_nunavut);
            CheckBox i = (CheckBox) findViewById(R.id.check_ontario);
            CheckBox j = (CheckBox) findViewById(R.id.check_pei);
            CheckBox k = (CheckBox) findViewById(R.id.check_quebec);
            CheckBox l = (CheckBox) findViewById(R.id.check_saska);
            CheckBox m = (CheckBox) findViewById(R.id.check_yukon);
            TextView pC = (TextView) findViewById(R.id.percent_canada);

            SharedPreferences.Editor myEdit = sharedPreferences.edit();

            myEdit.putBoolean("1", a.isChecked());
            myEdit.putBoolean("2", a.isChecked());
            myEdit.putBoolean("3", a.isChecked());
            myEdit.putBoolean("4", a.isChecked());
            myEdit.putBoolean("5", a.isChecked());
            myEdit.putBoolean("6", a.isChecked());
            myEdit.putBoolean("7", a.isChecked());
            myEdit.putBoolean("8", a.isChecked());
            myEdit.putBoolean("9", a.isChecked());
            myEdit.putBoolean("10", a.isChecked());
            myEdit.putBoolean("11", a.isChecked());
            myEdit.putBoolean("12", a.isChecked());
            myEdit.putBoolean("13", a.isChecked());
            myEdit.putString("percent", pC.getText().toString());

            myEdit.apply();


        }
        public void countalberta(View view){
            CheckBox cb =  findViewById(R.id.check_alberta);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countbc(View view){
            CheckBox cb =  findViewById(R.id.check_bc);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countmanitoba(View view){
            CheckBox cb =  findViewById(R.id.check_manitoba);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countnb(View view){
            CheckBox cb =  findViewById(R.id.check_nb);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countnfl(View view){
            CheckBox cb =  findViewById(R.id.check_nfl);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countnt(View view){
            CheckBox cb =  findViewById(R.id.check_nt);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countns(View view){
            CheckBox cb =  findViewById(R.id.check_ns);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countnunavut(View view){
            CheckBox cb =  findViewById(R.id.check_nunavut);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countontario(View view){
            CheckBox cb =  findViewById(R.id.check_ontario);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countpei(View view){
            CheckBox cb =  findViewById(R.id.check_pei);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countquebec(View view){
            CheckBox cb =  findViewById(R.id.check_quebec);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countsaska(View view){
            CheckBox cb =  findViewById(R.id.check_saska);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }
        public void countyukon(View view){
            CheckBox cb =  findViewById(R.id.check_yukon);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = (TextView) findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
        }

}