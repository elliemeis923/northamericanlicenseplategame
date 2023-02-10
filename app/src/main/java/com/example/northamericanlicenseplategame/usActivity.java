package com.example.northamericanlicenseplategame;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class usActivity extends AppCompatActivity {

    public int countUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);

        SharedPreferences shu = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        boolean c1 = shu.getBoolean("1", false);
        CheckBox a =  findViewById(R.id.check_alabama);
        a.setChecked(c1);
        boolean c2 = shu.getBoolean("2", false);
        CheckBox b =  findViewById(R.id.check_alaska);
        b.setChecked(c2);
        boolean c3 = shu.getBoolean("3", false);
        CheckBox c =  findViewById(R.id.check_arizona);
        c.setChecked(c3);
        boolean c4 = shu.getBoolean("4", false);
        CheckBox d =  findViewById(R.id.check_arkansas);
        d.setChecked(c4);
        boolean c5 = shu.getBoolean("5", false);
        CheckBox e =  findViewById(R.id.check_california);
        e.setChecked(c5);
        boolean c6 = shu.getBoolean("6", false);
        CheckBox f =  findViewById(R.id.check_colorado);
        f.setChecked(c6);
        boolean c7 = shu.getBoolean("7", false);
        CheckBox g =  findViewById(R.id.check_connecticut);
        g.setChecked(c7);
        boolean c8 = shu.getBoolean("8", false);
        CheckBox h =  findViewById(R.id.check_delaware);
        h.setChecked(c8);
        boolean c9 = shu.getBoolean("9", false);
        CheckBox i =  findViewById(R.id.check_florida);
        i.setChecked(c8);
        boolean c10 = shu.getBoolean("10", false);
        CheckBox j =  findViewById(R.id.check_georgia);
        j.setChecked(c10);
        boolean c11 = shu.getBoolean("11", false);
        CheckBox k =  findViewById(R.id.check_hawaii);
        k.setChecked(c11);
        boolean c12 = shu.getBoolean("12", false);
        CheckBox l =  findViewById(R.id.check_idaho);
        l.setChecked(c12);
        boolean c13 = shu.getBoolean("13", false);
        CheckBox m =  findViewById(R.id.check_illinois);
        m.setChecked(c13);
        boolean c14 = shu.getBoolean("14", false);
        CheckBox n =  findViewById(R.id.check_indiana);
        n.setChecked(c14);
        boolean c15 = shu.getBoolean("15", false);
        CheckBox o =  findViewById(R.id.check_iowa);
        o.setChecked(c15);
        boolean c16 = shu.getBoolean("16", false);
        CheckBox p =  findViewById(R.id.check_kansas);
        p.setChecked(c16);
        boolean c17 = shu.getBoolean("17", false);
        CheckBox q =  findViewById(R.id.check_kentucky);
        q.setChecked(c17);
        boolean c18 = shu.getBoolean("18", false);
        CheckBox r =  findViewById(R.id.check_louisiana);
        r.setChecked(c18);
        boolean c19 = shu.getBoolean("19", false);
        CheckBox s =  findViewById(R.id.check_maine);
        s.setChecked(c19);
        boolean c20 = shu.getBoolean("20", false);
        CheckBox t =  findViewById(R.id.check_maryland);
        t.setChecked(c20);
        boolean c21 = shu.getBoolean("21", false);
        CheckBox u =  findViewById(R.id.check_mass);
        u.setChecked(c21);
        boolean c22 = shu.getBoolean("22", false);
        CheckBox v =  findViewById(R.id.check_michigan);
        v.setChecked(c22);
        boolean c23 = shu.getBoolean("23", false);
        CheckBox w =  findViewById(R.id.check_minnesota);
        w.setChecked(c23);
        boolean c24 = shu.getBoolean("24", false);
        CheckBox x =  findViewById(R.id.check_mississippi);
        x.setChecked(c24);
        boolean c25 = shu.getBoolean("25", false);
        CheckBox y =  findViewById(R.id.check_missouri);
        y.setChecked(c25);
        boolean c26 = shu.getBoolean("26", false);
        CheckBox z =  findViewById(R.id.check_montana);
        z.setChecked(c26);
        boolean c27 = shu.getBoolean("27", false);
        CheckBox a1 =  findViewById(R.id.check_nebraska);
        a1.setChecked(c27);
        boolean c28 = shu.getBoolean("28", false);
        CheckBox b1 =  findViewById(R.id.check_nevada);
        b1.setChecked(c28);
        boolean c29 = shu.getBoolean("29", false);
        CheckBox calso =  findViewById(R.id.check_nh);
        calso.setChecked(c29);
        boolean c30 = shu.getBoolean("30", false);
        CheckBox d1 =  findViewById(R.id.check_nj);
        d1.setChecked(c30);
        boolean c31 = shu.getBoolean("31", false);
        CheckBox e1 =  findViewById(R.id.check_nm);
        e1.setChecked(c31);
        boolean c32 = shu.getBoolean("32", false);
        CheckBox f1 =  findViewById(R.id.check_ny);
        f1.setChecked(c32);
        boolean c33 = shu.getBoolean("33", false);
        CheckBox g1 =  findViewById(R.id.check_nc);
        g1.setChecked(c33);
        boolean c34 = shu.getBoolean("34", false);
        CheckBox h1 =  findViewById(R.id.check_nd);
        h1.setChecked(c34);
        boolean c35 = shu.getBoolean("35", false);
        CheckBox i1 =  findViewById(R.id.check_ohio);
        i1.setChecked(c35);
        boolean c36 = shu.getBoolean("36", false);
        CheckBox j1 =  findViewById(R.id.check_ok);
        j1.setChecked(c36);
        boolean c37 = shu.getBoolean("37", false);
        CheckBox k1 =  findViewById(R.id.check_or);
        k1.setChecked(c37);
        boolean c38 = shu.getBoolean("38", false);
        CheckBox l1 =  findViewById(R.id.check_penn);
        l1.setChecked(c38);
        boolean c39 = shu.getBoolean("39", false);
        CheckBox m1 =  findViewById(R.id.check_ri);
        m1.setChecked(c39);
        boolean c40 = shu.getBoolean("40", false);
        CheckBox n1 =  findViewById(R.id.check_sc);
        n1.setChecked(c40);
        boolean c41 = shu.getBoolean("41", false);
        CheckBox o1 =  findViewById(R.id.check_sd);
        o1.setChecked(c41);
        boolean c42 = shu.getBoolean("42", false);
        CheckBox p1 =  findViewById(R.id.check_tenn);
        p1.setChecked(c42);
        boolean c43 = shu.getBoolean("43", false);
        CheckBox q1 =  findViewById(R.id.check_tx);
        q1.setChecked(c43);
        boolean c44 = shu.getBoolean("44", false);
        CheckBox r1 =  findViewById(R.id.check_utah);
        r1.setChecked(c44);
        boolean c45 = shu.getBoolean("45", false);
        CheckBox s1 =  findViewById(R.id.check_vermont);
        s1.setChecked(c45);
        boolean c46 = shu.getBoolean("46", false);
        CheckBox t1 =  findViewById(R.id.check_virginia);
        t1.setChecked(c46);
        boolean c47 = shu.getBoolean("47", false);
        CheckBox u1 =  findViewById(R.id.check_wash);
        u1.setChecked(c47);
        boolean c48 = shu.getBoolean("48", false);
        CheckBox v1 =  findViewById(R.id.check_wv);
        v1.setChecked(c48);
        boolean c49 = shu.getBoolean("49", false);
        CheckBox w1 =  findViewById(R.id.check_wis);
        w1.setChecked(c49);
        boolean c50 = shu.getBoolean("50", false);
        CheckBox x1 =  findViewById(R.id.check_wy);
        x1.setChecked(c50);

        countUs = calculateCount();
        TextView tv =  findViewById(R.id.percent_us);
        tv.setText(countUs + "/50");
    }

    public int calculateCount(){
        int count = 0;
        CheckBox alabama =  findViewById(R.id.check_alabama);
        if(alabama.isChecked()){count ++;}
        CheckBox alaska =  findViewById(R.id.check_alaska);
        if(alaska.isChecked()){count ++;}
        CheckBox arizona =  findViewById(R.id.check_arizona);
        if(arizona.isChecked()){count ++;}
        CheckBox arkansas =  findViewById(R.id.check_arkansas);
        if(arkansas.isChecked()){count ++;}
        CheckBox california =  findViewById(R.id.check_california);
        if(california.isChecked()){count ++;}
        CheckBox colorado =  findViewById(R.id.check_colorado);
        if(colorado.isChecked()){count ++;}

        CheckBox connecticut =  findViewById(R.id.check_connecticut);
        if(connecticut.isChecked()){count ++;}
        CheckBox delaware =  findViewById(R.id.check_delaware);
        if(delaware.isChecked()){count ++;}
        CheckBox florida =  findViewById(R.id.check_florida);
        if(florida.isChecked()){count ++;}
        CheckBox georgia =  findViewById(R.id.check_georgia);
        if(georgia.isChecked()){count ++;}
        CheckBox hawaii =  findViewById(R.id.check_hawaii);
        if(hawaii.isChecked()){count ++;}
        CheckBox idaho =  findViewById(R.id.check_idaho);
        if(idaho.isChecked()){count ++;}
        CheckBox ill =  findViewById(R.id.check_illinois);
        if(ill.isChecked()){count ++;}
        CheckBox ind =  findViewById(R.id.check_indiana);
        if(ind.isChecked()){count ++;}
        CheckBox iowa =  findViewById(R.id.check_iowa);
        if(iowa.isChecked()){count ++;}
        CheckBox kansas =  findViewById(R.id.check_kansas);
        if(kansas.isChecked()){count ++;}
        CheckBox kent =  findViewById(R.id.check_kentucky);
        if(kent.isChecked()){count ++;}
        CheckBox lou =  findViewById(R.id.check_louisiana);
        if(lou.isChecked()){count ++;}
        CheckBox maine =  findViewById(R.id.check_maine);
        if(maine.isChecked()){count ++;}
        CheckBox mary =  findViewById(R.id.check_maryland);
        if(mary.isChecked()){count ++;}
        CheckBox mass =  findViewById(R.id.check_mass);
        if(mass.isChecked()){count ++;}
        CheckBox mich =  findViewById(R.id.check_michigan);
        if(mich.isChecked()){count ++;}
        CheckBox minnesota =  findViewById(R.id.check_minnesota);
        if(minnesota.isChecked()){count ++;}
        CheckBox miss =  findViewById(R.id.check_mississippi);
        if(miss.isChecked()){count ++;}
        CheckBox mizzo =  findViewById(R.id.check_missouri);
        if(mizzo.isChecked()){count ++;}
        CheckBox mont =  findViewById(R.id.check_montana);
        if(mont.isChecked()){count ++;}
        CheckBox neb =  findViewById(R.id.check_nebraska);
        if(neb.isChecked()){count ++;}
        CheckBox nev =  findViewById(R.id.check_nevada);
        if(nev.isChecked()){count ++;}
        CheckBox nh =  findViewById(R.id.check_nh);
        if(nh.isChecked()){count ++;}
        CheckBox nj =  findViewById(R.id.check_nj);
        if(nj.isChecked()){count ++;}
        CheckBox nm =  findViewById(R.id.check_nm);
        if(nm.isChecked()){count ++;}
        CheckBox ny =  findViewById(R.id.check_ny);
        if(ny.isChecked()){count ++;}
        CheckBox nc =  findViewById(R.id.check_nc);
        if(nc.isChecked()){count ++;}
        CheckBox nd =  findViewById(R.id.check_nd);
        if(nd.isChecked()){count ++;}
        CheckBox ohio =  findViewById(R.id.check_ohio);
        if(ohio.isChecked()){count ++;}
        CheckBox ok =  findViewById(R.id.check_ok);
        if(ok.isChecked()){count ++;}
        CheckBox or =  findViewById(R.id.check_or);
        if(or.isChecked()){count ++;}
        CheckBox penn =  findViewById(R.id.check_penn);
        if(penn.isChecked()){count ++;}
        CheckBox ri =  findViewById(R.id.check_ri);
        if(ri.isChecked()){count ++;}
        CheckBox sc =  findViewById(R.id.check_sc);
        if(sc.isChecked()){count ++;}
        CheckBox sd =  findViewById(R.id.check_sd);
        if(sd.isChecked()){count ++;}
        CheckBox tenn =  findViewById(R.id.check_tenn);
        if(tenn.isChecked()){count ++;}
        CheckBox tx =  findViewById(R.id.check_tx);
        if(tx.isChecked()){count ++;}
        CheckBox utah =  findViewById(R.id.check_utah);
        if(utah.isChecked()){count ++;}
        CheckBox ver =  findViewById(R.id.check_vermont);
        if(ver.isChecked()){count ++;}
        CheckBox virg =  findViewById(R.id.check_virginia);
        if(virg.isChecked()){count ++;}
        CheckBox wash =  findViewById(R.id.check_wash);
        if(wash.isChecked()){count ++;}
        CheckBox wv =  findViewById(R.id.check_wv);
        if(wv.isChecked()){count ++;}
        CheckBox wis =  findViewById(R.id.check_wis);
        if(wis.isChecked()){count ++;}
        CheckBox wy =  findViewById(R.id.check_wy);
        if(wy.isChecked()){count ++;}

        return count;
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_alabama);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("1", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_alaska);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("2", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_arizona);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("3", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_arkansas);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("4", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_california);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("5", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_colorado);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("6", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_connecticut);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("7", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_delaware);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("8", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_florida);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("9", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_georgia);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("10", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_hawaii);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("11", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_idaho);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("12", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_illinois);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("13", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_indiana);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("14", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_iowa);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("15", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_kansas);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("16", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_kentucky);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("17", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_louisiana);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("18", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_maine);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("19", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_maryland);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("20", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_mass);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("21", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_michigan);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("22", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_minnesota);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("23", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_mississippi);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("24", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_missouri);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("25", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_montana);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("26", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nebraska);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("27", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nevada);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("28", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nh);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("29", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nj);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("30", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nm);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("31", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_ny);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("32", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nc);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("33", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nd);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("34", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_ohio);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("35", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_ok);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("36", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_or);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("37", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_penn);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("38", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_ri);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("39", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_sc);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("40", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_sd);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("41", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_tenn);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("42", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_tx);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("43", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_utah);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("44", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_vermont);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("45", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_virginia);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("46", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_wash);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("47", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_wv);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("48", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_wis);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("49", a.isChecked());
        myEdit.apply();
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
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_wy);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("50", a.isChecked());
        myEdit.apply();
    }


}
