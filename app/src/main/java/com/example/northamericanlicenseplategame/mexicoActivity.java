package com.example.northamericanlicenseplategame;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mexicoActivity extends AppCompatActivity {

    private static int countMexico;
    public static int getCount(){ return countMexico;}

    static int[] mexicoCheckIDs = {R.id.check_ac, R.id.check_bc, R.id.check_bcs, R.id.check_campeche, R.id.check_chipas, R.id.check_chihuahua, R.id.check_coahuila, R.id.check_colima,
            R.id.check_durango, R.id.check_guanajuato, R.id.check_guerrero, R.id.check_hidalgo, R.id.check_jalisco,
            R.id.check_mexico, R.id.check_mexicocity, R.id.check_michoacan, R.id.check_morelos, R.id.check_nayarit, R.id.check_nl,
            R.id.check_oaxaca, R.id.check_puebla, R.id.check_queretaro, R.id.check_qr, R.id.check_slp, R.id.check_sinaloa, R.id.check_sonora,
            R.id.check_tabasco, R.id.check_tamaulipas, R.id.check_tlaxcala, R.id.check_vc,  R.id.check_yucatan, R.id.check_zacatas };

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico);

        SharedPreferences shm = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        for(int id : mexicoCheckIDs)
        {
            boolean c1 = shm.getBoolean(Integer.toString(id), false);
            int index = getIndexFromID(id);
            CheckBox a =  findViewById(mexicoCheckIDs[index]);
            a.setChecked(c1);
        }

        countMexico = shm.getInt("cm", 0);
        countMexico = calculateCount();
        TextView tv =  findViewById(R.id.percent_mexico);
        tv.setText(countMexico + "/32");

    }

    public int calculateCount() {
        int count = 0;
        for(int id : mexicoCheckIDs)
        {
            int index = getIndexFromID(id);
            CheckBox a = findViewById(mexicoCheckIDs[index]);
            if(a.isChecked()){count ++;}
        }

        return count;
    }

    @SuppressLint("SetTextI18n")
    public void reset(View view){
        countMexico = 0;
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        for(int id : mexicoCheckIDs)
        {
            CheckBox cb = findViewById(id);
            cb.setChecked(false);
        }
    }

    @SuppressLint("NonConstantResourceId")
    public static int getIndexFromID(int id) {
        switch (id)
        {
            case R.id.check_ac:
                return 0;
            case R.id.check_bc:
                return 1;
            case R.id.check_bcs:
                return 2;
            case R.id.check_campeche:
                return 3;
            case R.id.check_chipas:
                return 4;
            case R.id.check_chihuahua:
                return 5;
            case R.id.check_coahuila:
                return 6;
            case R.id.check_colima:
                return 7;
            case R.id.check_durango:
                return 8;
            case R.id.check_guanajuato:
                return 9;
            case R.id.check_guerrero:
                return 10;
            case R.id.check_hidalgo:
                return 11;
            case R.id.check_jalisco:
                return 12;
            case R.id.check_mexico:
                return 13;
            case R.id.check_mexicocity:
                return 14;
            case R.id.check_michoacan:
                return 15;
            case R.id.check_morelos:
                return 16;
            case R.id.check_nayarit:
                return 17;
            case R.id.check_nl:
                return 18;
            case R.id.check_oaxaca:
                return 19;
            case R.id.check_puebla:
                return 20;
            case R.id.check_queretaro:
                return 21;
            case R.id.check_qr:
                return 22;
            case R.id.check_slp:
                return 23;
            case R.id.check_sinaloa:
                return 24;
            case R.id.check_sonora:
                return 25;
            case R.id.check_tabasco:
                return 26;
            case R.id.check_tamaulipas:
                return 27;
            case R.id.check_tlaxcala:
                return 28;
            case R.id.check_vc:
                return 29;
            case R.id.check_yucatan:
                return 30;
            case R.id.check_zacatas:
                return 31;
            default:
                return -99;
        }

    }

    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    public void countPlates(View view){

        int index = getIndexFromID(view.getId());

        switch (view.getId()) {
            case R.id.check_ac:
                index = 0;
                break;
            case R.id.check_bc:
                index = 1;
                break;
            case R.id.check_bcs:
                index = 2;
                break;
            case R.id.check_campeche:
                index = 3;
                break;
            case R.id.check_chipas:
                index = 4;
                break;
            case R.id.check_chihuahua:
                index = 5;
                break;
            case R.id.check_coahuila:
                index = 6;
                break;
            case R.id.check_colima:
                index = 7;
                break;
            case R.id.check_durango:
                index = 8;
                break;
            case R.id.check_guanajuato:
                index = 9;
                break;
            case R.id.check_guerrero:
                index = 10;
                break;
            case R.id.check_hidalgo:
                index = 11;
                break;
            case R.id.check_jalisco:
                index = 12;
                break;
            case R.id.check_mexico:
                index = 13;
                break;
            case R.id.check_mexicocity:
                index = 14;
                break;
            case R.id.check_michoacan:
                index = 15;
                break;
            case R.id.check_morelos:
                index = 16;
                break;
            case R.id.check_nayarit:
                index = 17;
                break;
            case R.id.check_nl:
                index = 18;
                break;
            case R.id.check_oaxaca:
                index = 19;
                break;
            case R.id.check_puebla:
                index = 20;
                break;
            case R.id.check_queretaro:
                index = 21;
                break;
            case R.id.check_qr:
                index = 22;
                break;
            case R.id.check_slp:
                index = 23;
                break;
            case R.id.check_sinaloa:
                index = 24;
                break;
            case R.id.check_sonora:
                index = 25;
                break;
            case R.id.check_tabasco:
                index = 26;
                break;
            case R.id.check_tamaulipas:
                index = 27;
                break;
            case R.id.check_tlaxcala:
                index = 28;
                break;
            case R.id.check_vc:
                index = 29;
                break;
            case R.id.check_yucatan:
                index = 30;
                break;
            case R.id.check_zacatas:
                index = 31;
                break;
        }

        CheckBox cb =  findViewById(mexicoCheckIDs[index]);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        //save
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean(Integer.toString(view.getId()), cb.isChecked());
        myEdit.putInt("cm", countMexico);
        myEdit.apply();
    }
}