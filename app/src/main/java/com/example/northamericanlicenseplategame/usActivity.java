package com.example.northamericanlicenseplategame;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class usActivity extends AppCompatActivity {

    public int countUs = 0;

    public int getCountUs() {
        return countUs;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);

        // your code goes here...

    }
    public void countalabama(View view){
        CheckBox cb =  findViewById(R.id.check_alabama);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }

    public void countalaska(View view){
        CheckBox cb =  findViewById(R.id.check_alaska);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countarizona(View view){
        CheckBox cb =  findViewById(R.id.check_arizona);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countarkansas(View view){
        CheckBox cb =  findViewById(R.id.check_arkansas);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countcalifornia(View view){
        CheckBox cb =  findViewById(R.id.check_california);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countcolorado(View view){
        CheckBox cb =  findViewById(R.id.check_colorado);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countconnecticut(View view){
        CheckBox cb =  findViewById(R.id.check_connecticut);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countdelaware(View view){
        CheckBox cb =  findViewById(R.id.check_delaware);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countflorida(View view){
        CheckBox cb =  findViewById(R.id.check_florida);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countgeorgia(View view){
        CheckBox cb =  findViewById(R.id.check_georgia);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void counthawaii(View view){
        CheckBox cb =  findViewById(R.id.check_hawaii);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countidaho(View view){
        CheckBox cb =  findViewById(R.id.check_idaho);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countillinois(View view){
        CheckBox cb =  findViewById(R.id.check_illinois);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countindiana(View view){
        CheckBox cb =  findViewById(R.id.check_indiana);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countiowa(View view){
        CheckBox cb =  findViewById(R.id.check_iowa);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countkansas(View view){
        CheckBox cb =  findViewById(R.id.check_kansas);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countkentucky(View view){
        CheckBox cb =  findViewById(R.id.check_kentucky);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countlouisiana(View view){
        CheckBox cb =  findViewById(R.id.check_louisiana);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmaine(View view){
        CheckBox cb =  findViewById(R.id.check_maine);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmaryland(View view){
        CheckBox cb =  findViewById(R.id.check_maryland);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmass(View view){
        CheckBox cb =  findViewById(R.id.check_mass);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmichigan(View view){
        CheckBox cb =  findViewById(R.id.check_michigan);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countminnesota(View view){
        CheckBox cb =  findViewById(R.id.check_minnesota);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmississippi(View view){
        CheckBox cb =  findViewById(R.id.check_mississippi);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmissouri(View view){
        CheckBox cb =  findViewById(R.id.check_missouri);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countmontana(View view){
        CheckBox cb =  findViewById(R.id.check_montana);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnebraska(View view){
        CheckBox cb =  findViewById(R.id.check_nebraska);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnevada(View view){
        CheckBox cb =  findViewById(R.id.check_nevada);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnh(View view){
        CheckBox cb =  findViewById(R.id.check_nh);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnj(View view){
        CheckBox cb =  findViewById(R.id.check_nj);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnm(View view){
        CheckBox cb =  findViewById(R.id.check_nm);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countny(View view){
        CheckBox cb =  findViewById(R.id.check_ny);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnc(View view){
        CheckBox cb =  findViewById(R.id.check_nc);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countnd(View view){
        CheckBox cb =  findViewById(R.id.check_nd);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countohio(View view){
        CheckBox cb =  findViewById(R.id.check_ohio);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countok(View view){
        CheckBox cb =  findViewById(R.id.check_ok);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countor(View view){
        CheckBox cb =  findViewById(R.id.check_or);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countpenn(View view){
        CheckBox cb =  findViewById(R.id.check_penn);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countri(View view){
        CheckBox cb =  findViewById(R.id.check_ri);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countsc(View view){
        CheckBox cb =  findViewById(R.id.check_sc);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countsd(View view){
        CheckBox cb =  findViewById(R.id.check_sd);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void counttenn(View view){
        CheckBox cb =  findViewById(R.id.check_tenn);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void counttx(View view){
        CheckBox cb =  findViewById(R.id.check_tx);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countutah(View view){
        CheckBox cb =  findViewById(R.id.check_utah);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countvermont(View view){
        CheckBox cb =  findViewById(R.id.check_vermont);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countvirginia(View view){
        CheckBox cb =  findViewById(R.id.check_virginia);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countwash(View view){
        CheckBox cb =  findViewById(R.id.check_wash);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countwv(View view){
        CheckBox cb =  findViewById(R.id.check_wv);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countwis(View view){
        CheckBox cb =  findViewById(R.id.check_wis);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }
    public void countwy(View view){
        CheckBox cb =  findViewById(R.id.check_wy);
        boolean checked = cb.isChecked();
        if(checked){
            countUs++;
        }
        else{
            countUs--;
        }
        TextView tv = (TextView) findViewById(R.id.percent_us);
        tv.setText(countUs +"/50");
    }


}
