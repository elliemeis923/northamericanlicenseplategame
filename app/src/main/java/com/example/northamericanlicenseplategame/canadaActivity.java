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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        // your code goes here...




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