package com.example.northamericanlicenseplategame;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class usActivity extends AppCompatActivity {

    private static int countUs;
    public static int getCount(){ return countUs;}

   static int[] usCheckIDs = {R.id.check_alabama, R.id.check_alaska, R.id.check_arizona, R.id.check_arkansas, R.id.check_california, R.id.check_colorado, R.id.check_connecticut, R.id.check_delaware,
            R.id.check_florida, R.id.check_georgia, R.id.check_hawaii, R.id.check_idaho, R.id.check_illinois,
            R.id.check_indiana, R.id.check_iowa, R.id.check_kansas, R.id.check_kentucky, R.id.check_louisiana, R.id.check_maine,
            R.id.check_maryland, R.id.check_mass, R.id.check_michigan, R.id.check_minnesota, R.id.check_mississippi, R.id.check_missouri, R.id.check_montana,
            R.id.check_nebraska, R.id.check_nevada, R.id.check_nh, R.id.check_nj,  R.id.check_nm, R.id.check_ny, R.id.check_nc, R.id.check_nd, R.id.check_ohio, R.id.check_ok,
            R.id.check_or, R.id.check_penn, R.id.check_ri, R.id.check_sc, R.id.check_sd, R.id.check_tenn, R.id.check_tx, R.id.check_utah, R.id.check_vermont, R.id.check_virginia, R.id.check_wash,
            R.id.check_wv, R.id.check_wis, R.id.check_wy };

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);

        SharedPreferences shu = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        for(int id : usCheckIDs)
        {
            boolean c1 = shu.getBoolean(Integer.toString(id), false);
            int index = getIndexFromID(id);
            CheckBox a =  findViewById(usCheckIDs[index]);
            a.setChecked(c1);
        }

        countUs = shu.getInt("cu", 0);
        countUs = calculateCount();
        TextView tv =  findViewById(R.id.percent_us);
        tv.setText(countUs + "/50");

    }
    public int calculateCount(){
        int count = 0;
        for(int id : usCheckIDs)
        {
            int index = getIndexFromID(id);
            CheckBox a =  findViewById(usCheckIDs[index]);
            if(a.isChecked()){count ++;}
        }

        return count;
    }


    @SuppressLint("SetTextI18n")
    public void reset(View view){
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        countUs = 0;
        for(int id : usCheckIDs)
        {
            CheckBox cb =  findViewById(id);
            cb.setChecked(false);
            myEdit.putBoolean(Integer.toString(id), false);
        }
        TextView tv = findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
        myEdit.putBoolean(Integer.toString(view.getId()), false);
        myEdit.putInt("cu", countUs);
        myEdit.apply();
    }

    @SuppressLint("NonConstantResourceId")
    public static int getIndexFromID(int id) {
        switch (id)
        {
            case R.id.check_alabama:
                return 0;
            case R.id.check_alaska:
                return 1;
            case R.id.check_arizona:
                return 2;
            case R.id.check_arkansas:
                return 3;
            case R.id.check_california:
                return 4;
            case R.id.check_colorado:
                return 5;
            case R.id.check_connecticut:
                return 6;
            case R.id.check_delaware:
                return 7;
            case R.id.check_florida:
                return 8;
            case R.id.check_georgia:
                return 9;
            case R.id.check_hawaii:
                return 10;
            case R.id.check_idaho:
                return 11;
            case R.id.check_illinois:
                return 12;
            case R.id.check_indiana:
                return 13;
            case R.id.check_iowa:
                return 14;
            case R.id.check_kansas:
                return 15;
            case R.id.check_kentucky:
                return 16;
            case R.id.check_louisiana:
                return 17;
            case R.id.check_maine:
                return 18;
            case R.id.check_maryland:
                return 19;
            case R.id.check_mass:
                return 20;
            case R.id.check_michigan:
                return 21;
            case R.id.check_minnesota:
                return 22;
            case R.id.check_mississippi:
                return 23;
            case R.id.check_missouri:
                return 24;
            case R.id.check_montana:
                return 25;
            case R.id.check_nebraska:
                return 26;
            case R.id.check_nevada:
                return 27;
            case R.id.check_nh:
                return 28;
            case R.id.check_nj:
                return 29;
            case R.id.check_nm:
                return 30;
            case R.id.check_ny:
                return 31;
            case R.id.check_nc:
                return 32;
            case R.id.check_nd:
                return 33;
            case R.id.check_ohio:
                return 34;
            case R.id.check_ok:
                return 35;
            case R.id.check_or:
                return 36;
            case R.id.check_penn:
                return 37;
            case R.id.check_ri:
                return 38;
            case R.id.check_sc:
                return 39;
            case R.id.check_sd:
                return 40;
            case R.id.check_tenn:
                return 41;
            case R.id.check_tx:
                return 42;
            case R.id.check_utah:
                return 43;
            case R.id.check_vermont:
                return 44;
            case R.id.check_virginia:
                return 45;
            case R.id.check_wash:
                return 46;
            case R.id.check_wv:
                return 47;
            case R.id.check_wis:
                return 48;
            case R.id.check_wy:
                return 49;
            default:
                return -99;
        }

        }
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void countPlates(View view){

        int index = getIndexFromID(view.getId());

        switch (view.getId()) {
            case R.id.check_alabama:
                index = 0;
                break;
            case R.id.check_alaska:
                index = 1;
                break;
            case R.id.check_arizona:
                index = 2;
                break;
            case R.id.check_arkansas:
                index = 3;
                break;
            case R.id.check_california:
                index = 4;
                break;
            case R.id.check_colorado:
                index = 5;
                break;
            case R.id.check_connecticut:
                index = 6;
                break;
            case R.id.check_delaware:
                index = 7;
                break;
            case R.id.check_florida:
                index = 8;
                break;
            case R.id.check_georgia:
                index = 9;
                break;
            case R.id.check_hawaii:
                index = 10;
                break;
            case R.id.check_idaho:
                index = 11;
                break;
            case R.id.check_illinois:
                index = 12;
                break;
            case R.id.check_indiana:
                index = 13;
                break;
            case R.id.check_iowa:
                index = 14;
                break;
            case R.id.check_kansas:
                index = 15;
                break;
            case R.id.check_kentucky:
                index = 16;
                break;
            case R.id.check_louisiana:
                index = 17;
                break;
            case R.id.check_maine:
                index = 18;
                break;
            case R.id.check_maryland:
                index = 19;
                break;
            case R.id.check_mass:
                index = 20;
                break;
            case R.id.check_michigan:
                index = 21;
                break;
            case R.id.check_minnesota:
                index = 22;
                break;
            case R.id.check_mississippi:
                index = 23;
                break;
            case R.id.check_missouri:
                index = 24;
                break;
            case R.id.check_montana:
                index = 25;
                break;
            case R.id.check_nebraska:
                index = 26;
                break;
            case R.id.check_nevada:
                index = 27;
                break;
            case R.id.check_nh:
                index = 28;
                break;
            case R.id.check_nj:
                index = 29;
                break;
            case R.id.check_nm:
                index = 30;
                break;
            case R.id.check_ny:
                index = 31;
                break;
            case R.id.check_nc:
                index = 32;
                break;
            case R.id.check_nd:
                index = 33;
                break;
            case R.id.check_ohio:
                index = 34;
                break;
            case R.id.check_ok:
                index = 35;
                break;
            case R.id.check_or:
                index = 36;
                break;
            case R.id.check_penn:
                index = 37;
                break;
            case R.id.check_ri:
                index = 38;
                break;
            case R.id.check_sc:
                index = 39;
                break;
            case R.id.check_sd:
                index = 40;
                break;
            case R.id.check_tenn:
                index = 41;
                break;
            case R.id.check_tx:
                index = 42;
                break;
            case R.id.check_utah:
                index = 43;
                break;
            case R.id.check_vermont:
                index = 44;
                break;
            case R.id.check_virginia:
                index = 45;
                break;
            case R.id.check_wash:
                index = 46;
                break;
            case R.id.check_wv:
                index = 47;
                break;
            case R.id.check_wis:
                index = 48;
                break;
            case R.id.check_wy:
                index = 49;
                break;
        }

        CheckBox cb =  findViewById(usCheckIDs[index]);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
        //save
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean(Integer.toString(view.getId()), cb.isChecked());
        myEdit.putInt("cu", countUs);
        myEdit.apply();
    }
}
