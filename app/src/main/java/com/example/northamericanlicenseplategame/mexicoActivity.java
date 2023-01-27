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

    public int countMexico = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico);



        // your code goes here...




    }

    public void countac(View view){
        CheckBox cb =  findViewById(R.id.check_ac);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countbc(View view){
        CheckBox cb =  findViewById(R.id.check_bc);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countbcs(View view){
        CheckBox cb =  findViewById(R.id.check_bcs);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countcampeche(View view){
        CheckBox cb =  findViewById(R.id.check_campeche);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countchiapas(View view){
        CheckBox cb =  findViewById(R.id.check_chipas);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countchihuahua(View view){
        CheckBox cb =  findViewById(R.id.check_chihuahua);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countcoahuila(View view){
        CheckBox cb =  findViewById(R.id.check_coahuila);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countcolima(View view){
        CheckBox cb =  findViewById(R.id.check_colima);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countdurango(View view){
        CheckBox cb =  findViewById(R.id.check_durango);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countguanajuato(View view){
        CheckBox cb =  findViewById(R.id.check_guanajuato);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countguerrero(View view){
        CheckBox cb =  findViewById(R.id.check_guerrero);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void counthidalgo(View view){
        CheckBox cb =  findViewById(R.id.check_hidalgo);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countjalisco(View view){
        CheckBox cb =  findViewById(R.id.check_jalisco);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countmexico(View view){
        CheckBox cb =  findViewById(R.id.check_mexico);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");

    }
    public void countmexicocity(View view){
        CheckBox cb =  findViewById(R.id.check_mexicocity);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countmichoacan(View view){
        CheckBox cb =  findViewById(R.id.check_michoacan);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countmorelos(View view){
        CheckBox cb =  findViewById(R.id.check_morelos);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countnayarit(View view){
        CheckBox cb =  findViewById(R.id.check_nayarit);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countnl(View view){
        CheckBox cb =  findViewById(R.id.check_nl);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countoaxaca(View view){
        CheckBox cb =  findViewById(R.id.check_oaxaca);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countpuebla(View view){
        CheckBox cb =  findViewById(R.id.check_puebla);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countqueretaro(View view){
        CheckBox cb =  findViewById(R.id.check_queretaro);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countqr(View view){
        CheckBox cb =  findViewById(R.id.check_qr);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countslp(View view){
        CheckBox cb =  findViewById(R.id.check_slp);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countsinaloa(View view){
        CheckBox cb =  findViewById(R.id.check_sinaloa);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countsonora(View view){
        CheckBox cb =  findViewById(R.id.check_sonora);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void counttabasco(View view){
        CheckBox cb =  findViewById(R.id.check_tabasco);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void counttamaulipas(View view){
        CheckBox cb =  findViewById(R.id.check_tamaulipas);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void counttlaxcala(View view){
        CheckBox cb =  findViewById(R.id.check_tlaxcala);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countvc(View view){
        CheckBox cb =  findViewById(R.id.check_vc);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countyucatan(View view){
        CheckBox cb =  findViewById(R.id.check_yucatan);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
    public void countzacatas(View view){
        CheckBox cb =  findViewById(R.id.check_zacatas);
        boolean checked = cb.isChecked();
        if(checked){
            countMexico++;
        }
        else{
            countMexico--;
        }
        TextView tv = (TextView) findViewById(R.id.percent);
        tv.setText(countMexico +"/32");
    }
}