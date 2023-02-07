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

    public int countCanada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        countCanada = calculateCount();
        TextView tv = (TextView) findViewById(R.id.percent_canada);
        tv.setText(countCanada + "/13");

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

    }
        public int calculateCount(){
            int count = 0;
            CheckBox a =  findViewById(R.id.check_alberta);
            boolean checked = a.isChecked();
            if(checked){count ++;}
            CheckBox b =  findViewById(R.id.check_bc);
            boolean c2 = b.isChecked();
            if(c2){count ++;}
            CheckBox c =  findViewById(R.id.check_manitoba);
            boolean c3 = c.isChecked();
            if(c3){count ++;}
            CheckBox d =  findViewById(R.id.check_nb);
            boolean c4 = d.isChecked();
            if(c4){count ++;}
            CheckBox e =  findViewById(R.id.check_nfl);
            boolean c5 = e.isChecked();
            if(c5){count ++;}
            CheckBox f =  findViewById(R.id.check_nt);
            boolean c6 = f.isChecked();
            if(c6){count ++;}
            CheckBox g =  findViewById(R.id.check_ns);
            boolean c7 = g.isChecked();
            if(c7){count ++;}
            CheckBox h =  findViewById(R.id.check_nunavut);
            boolean c8 = h.isChecked();
            if(c8){count ++;}
            CheckBox i =  findViewById(R.id.check_ontario);
            boolean c9 = i.isChecked();
            if(c9){count ++;}
            CheckBox m =  findViewById(R.id.check_saska);
            boolean c10 = m.isChecked();
            if(c10){count ++;}
            CheckBox j =  findViewById(R.id.check_pei);
            boolean c11 = j.isChecked();
            if(c11){count ++;}
            CheckBox k =  findViewById(R.id.check_quebec);
            boolean c12 = k.isChecked();
            if(c12){count ++;}
            CheckBox l =  findViewById(R.id.check_yukon);
            boolean c13 = l.isChecked();
            if(c13){count ++;}

            return count;
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
            //save
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_alberta);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("1", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_bc);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("2", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_manitoba);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("3", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_nb);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("4", a.isChecked());
            myEdit.apply();

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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_nfl);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("5", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_nt);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("6", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_ns);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("7", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_nunavut);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("8", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_ontario);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("9", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_pei);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("10", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_quebec);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("11", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_saska);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("12", a.isChecked());
            myEdit.apply();
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
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            CheckBox a = (CheckBox) findViewById(R.id.check_yukon);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean("13", a.isChecked());
            myEdit.apply();
        }

}