package com.example.northamericanlicenseplategame;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class canadaActivity extends AppCompatActivity {

    private static int countCanada;
    public static int getCount(){ return countCanada;}

    static int[] canadaCheckIDs = {R.id.check_alberta, R.id.check_bc, R.id.check_manitoba, R.id.check_nb, R.id.check_nfl, R.id.check_nt, R.id.check_ns, R.id.check_nunavut,
            R.id.check_ontario, R.id.check_pei, R.id.check_quebec, R.id.check_saska, R.id.check_yukon };


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        SharedPreferences shc = getSharedPreferences("sharedpreferences", MODE_PRIVATE);

        for(int id : canadaCheckIDs)
        {
            boolean c1 = shc.getBoolean(Integer.toString(id), false);
            int index = getIndexFromID(id);
            CheckBox a =  findViewById(canadaCheckIDs[index]);
            a.setChecked(c1);
        }

        countCanada = shc.getInt("cc", 0);
        countCanada = calculateCount();
        TextView tv =  findViewById(R.id.percent_canada);
        tv.setText(countCanada + "/13");

    }
        public int calculateCount(){
            int count = 0;
            for(int id : canadaCheckIDs)
            {
                int index = getIndexFromID(id);
                CheckBox a =  findViewById(canadaCheckIDs[index]);
                if(a.isChecked()){count ++;}
            }

            return count;
        }

        @SuppressLint("SetTextI18n")
        public void reset(View view){
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            countCanada = 0;
            TextView tv = findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
            for(int id : canadaCheckIDs)
            {
                int index = getIndexFromID(id);
                CheckBox cb =  findViewById(canadaCheckIDs[index]);
                cb.setChecked(false);
                myEdit.putBoolean(Integer.toString(view.getId()), cb.isChecked());
            }
            myEdit.putInt("cc", countCanada);
            myEdit.apply();
           /* SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            countCanada = 0;
            TextView tv = findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
            for(int id : canadaCheckIDs)
            {
                CheckBox cb = findViewById(id);
                cb.setChecked(false);
                myEdit.putBoolean(Integer.toString(view.getId()), cb.isChecked());
            }
            myEdit.putInt("cc", countCanada);
            myEdit.apply();*/
        }

        @SuppressLint("NonConstantResourceId")
        public static int getIndexFromID(int id) {
            switch (id)
            {
                case R.id.check_alberta:
                    return 0;
                case R.id.check_bc:
                    return 1;
                case R.id.check_manitoba:
                    return 2;
                case R.id.check_nb:
                    return 3;
                case R.id.check_nfl:
                    return 4;
                case R.id.check_nt:
                    return 5;
                case R.id.check_ns:
                    return 6;
                case R.id.check_nunavut:
                    return 7;
                case R.id.check_ontario:
                    return 8;
                case R.id.check_pei:
                    return 9;
                case R.id.check_quebec:
                    return 10;
                case R.id.check_saska:
                    return 11;
                case R.id.check_yukon:
                    return 12;
                default:
                    return -99;
            }

        }

        @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
        public void countPlates(View view){

            int index = getIndexFromID(view.getId());

            switch (view.getId()) {
                case R.id.check_alberta:
                    index = 0;
                    break;
                case R.id.check_bc:
                    index = 1;
                    break;
                case R.id.check_manitoba:
                    index = 2;
                    break;
                case R.id.check_nb:
                    index = 3;
                    break;
                case R.id.check_nfl:
                    index = 4;
                    break;
                case R.id.check_nt:
                    index = 5;
                    break;
                case R.id.check_ns:
                    index = 6;
                    break;
                case R.id.check_nunavut:
                    index = 7;
                    break;
                case R.id.check_ontario:
                    index = 8;
                    break;
                case R.id.check_pei:
                    index = 9;
                    break;
                case R.id.check_quebec:
                    index = 10;
                    break;
                case R.id.check_saska:
                    index = 11;
                    break;
                case R.id.check_yukon:
                    index = 12;
                    break;
            }

            CheckBox cb =  findViewById(canadaCheckIDs[index]);
            boolean checked = cb.isChecked();
            if(checked){
                countCanada++;
            }
            else{
                countCanada--;
            }
            TextView tv = findViewById(R.id.percent_canada);
            tv.setText(countCanada +"/13");
            //save
            SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putBoolean(Integer.toString(view.getId()), cb.isChecked());
            myEdit.putInt("cc", countCanada);
            myEdit.apply();
        }

}