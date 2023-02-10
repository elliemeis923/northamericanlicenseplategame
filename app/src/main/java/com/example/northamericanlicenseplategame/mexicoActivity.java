package com.example.northamericanlicenseplategame;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mexicoActivity extends AppCompatActivity {

    public int countMexico;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mexico);

        SharedPreferences sh = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        boolean c1 = sh.getBoolean("1", false);
        CheckBox a =  findViewById(R.id.check_ac);
        a.setChecked(c1);
        boolean c2 = sh.getBoolean("2", false);
        CheckBox b =  findViewById(R.id.check_bc);
        b.setChecked(c2);
        boolean c3 = sh.getBoolean("3", false);
        CheckBox c =  findViewById(R.id.check_bcs);
        c.setChecked(c3);
        boolean c4 = sh.getBoolean("4", false);
        CheckBox d =  findViewById(R.id.check_campeche);
        d.setChecked(c4);
        boolean c5 = sh.getBoolean("5", false);
        CheckBox e =  findViewById(R.id.check_chipas);
        e.setChecked(c5);
        boolean c6 = sh.getBoolean("6", false);
        CheckBox f =  findViewById(R.id.check_chihuahua);
        f.setChecked(c6);
        boolean c7 = sh.getBoolean("7", false);
        CheckBox g =  findViewById(R.id.check_coahuila);
        g.setChecked(c7);
        boolean c8 = sh.getBoolean("8", false);
        CheckBox h =  findViewById(R.id.check_colima);
        h.setChecked(c8);
        boolean c9 = sh.getBoolean("9", false);
        CheckBox i =  findViewById(R.id.check_durango);
        i.setChecked(c8);
        boolean c10 = sh.getBoolean("10", false);
        CheckBox j =  findViewById(R.id.check_guanajuato);
        j.setChecked(c10);
        boolean c11 = sh.getBoolean("11", false);
        CheckBox k =  findViewById(R.id.check_guerrero);
        k.setChecked(c11);
        boolean c12 = sh.getBoolean("12", false);
        CheckBox l =  findViewById(R.id.check_hidalgo);
        l.setChecked(c12);
        boolean c13 = sh.getBoolean("13", false);
        CheckBox m =  findViewById(R.id.check_jalisco);
        m.setChecked(c13);
        boolean c14 = sh.getBoolean("14", false);
        CheckBox n =  findViewById(R.id.check_mexico);
        n.setChecked(c14);
        boolean c15 = sh.getBoolean("15", false);
        CheckBox o =  findViewById(R.id.check_mexicocity);
        o.setChecked(c15);
        boolean c16 = sh.getBoolean("16", false);
        CheckBox p =  findViewById(R.id.check_michoacan);
        p.setChecked(c16);
        boolean c17 = sh.getBoolean("17", false);
        CheckBox q =  findViewById(R.id.check_morelos);
        q.setChecked(c17);
        boolean c18 = sh.getBoolean("18", false);
        CheckBox r =  findViewById(R.id.check_nayarit);
        r.setChecked(c18);
        boolean c19 = sh.getBoolean("19", false);
        CheckBox s =  findViewById(R.id.check_nl);
        s.setChecked(c19);
        boolean c20 = sh.getBoolean("20", false);
        CheckBox t =  findViewById(R.id.check_oaxaca);
        t.setChecked(c20);
        boolean c21 = sh.getBoolean("21", false);
        CheckBox u =  findViewById(R.id.check_puebla);
        u.setChecked(c21);
        boolean c22 = sh.getBoolean("22", false);
        CheckBox v =  findViewById(R.id.check_queretaro);
        v.setChecked(c22);
        boolean c23 = sh.getBoolean("23", false);
        CheckBox w =  findViewById(R.id.check_qr);
        w.setChecked(c23);
        boolean c24 = sh.getBoolean("24", false);
        CheckBox x =  findViewById(R.id.check_slp);
        x.setChecked(c24);
        boolean c25 = sh.getBoolean("25", false);
        CheckBox y =  findViewById(R.id.check_sinaloa);
        y.setChecked(c25);
        boolean c26 = sh.getBoolean("26", false);
        CheckBox z =  findViewById(R.id.check_sonora);
        z.setChecked(c26);
        boolean c27 = sh.getBoolean("27", false);
        CheckBox a1 =  findViewById(R.id.check_tabasco);
        a1.setChecked(c27);
        boolean c28 = sh.getBoolean("28", false);
        CheckBox b1 =  findViewById(R.id.check_tamaulipas);
        b1.setChecked(c28);
        boolean c29 = sh.getBoolean("29", false);
        CheckBox calso =  findViewById(R.id.check_tlaxcala);
        calso.setChecked(c29);
        boolean c30 = sh.getBoolean("30", false);
        CheckBox d1 =  findViewById(R.id.check_vc);
        d1.setChecked(c30);
        boolean c31 = sh.getBoolean("31", false);
        CheckBox e1 =  findViewById(R.id.check_yucatan);
        e1.setChecked(c31);
        boolean c32 = sh.getBoolean("32", false);
        CheckBox f1 =  findViewById(R.id.check_zacatas);

        countMexico = calculateCount();
        TextView tv =  findViewById(R.id.percent_mexico);
        tv.setText(countMexico + "/32");
    }

    public int calculateCount() {
        int count = 0;
        CheckBox a = findViewById(R.id.check_ac);
        if (a.isChecked()) {
            count++;
        }
        CheckBox b = findViewById(R.id.check_bc);
        if (b.isChecked()) {
            count++;
        }
        CheckBox c = findViewById(R.id.check_bcs);
        if (c.isChecked()) {
            count++;
        }
        CheckBox d = findViewById(R.id.check_campeche);
        if (d.isChecked()) {
            count++;
        }
        CheckBox e = findViewById(R.id.check_chipas);
        if (e.isChecked()) {
            count++;
        }
        CheckBox f = findViewById(R.id.check_chihuahua);
        if (f.isChecked()) {
            count++;
        }
        CheckBox g = findViewById(R.id.check_coahuila);
        if (g.isChecked()) {
            count++;
        }
        CheckBox h = findViewById(R.id.check_colima);
        if (h.isChecked()) {
            count++;
        }
        CheckBox i = findViewById(R.id.check_durango);
        if (i.isChecked()) {
            count++;
        }
        CheckBox j = findViewById(R.id.check_guanajuato);
        if (j.isChecked()) {
            count++;
        }
        CheckBox k = findViewById(R.id.check_guerrero);
        if (k.isChecked()) {
            count++;
        }
        CheckBox l = findViewById(R.id.check_hidalgo);
        if (l.isChecked()) {
            count++;
        }
        CheckBox m = findViewById(R.id.check_jalisco);
        if (m.isChecked()) {
            count++;
        }
        CheckBox n = findViewById(R.id.check_mexico);
        if (n.isChecked()) {
            count++;
        }
        CheckBox o = findViewById(R.id.check_mexicocity);
        if (o.isChecked()) {
            count++;
        }
        CheckBox p = findViewById(R.id.check_michoacan);
        if (p.isChecked()) {
            count++;
        }
        CheckBox q = findViewById(R.id.check_morelos);
        if (q.isChecked()) {
            count++;
        }
        CheckBox r = findViewById(R.id.check_nayarit);
        if (r.isChecked()) {
            count++;
        }
        CheckBox s = findViewById(R.id.check_nl);
        if (s.isChecked()) {
            count++;
        }
        CheckBox t = findViewById(R.id.check_oaxaca);
        if (t.isChecked()) {
            count++;
        }
        CheckBox u = findViewById(R.id.check_puebla);
        if (u.isChecked()) {
            count++;
        }
        CheckBox v = findViewById(R.id.check_queretaro);
        if (v.isChecked()) {
            count++;
        }
        CheckBox w = findViewById(R.id.check_qr);
        if (w.isChecked()) {
            count++;
        }
        CheckBox x = findViewById(R.id.check_slp);
        if (x.isChecked()) {
            count++;
        }
        CheckBox y = findViewById(R.id.check_sinaloa);
        if (y.isChecked()) {
            count++;
        }
        CheckBox z = findViewById(R.id.check_sonora);
        if (z.isChecked()) {
            count++;
        }
        CheckBox a1 = findViewById(R.id.check_tabasco);
        if (a1.isChecked()) {
            count++;
        }
        CheckBox b1 = findViewById(R.id.check_tamaulipas);
        if (b1.isChecked()) {
            count++;
        }
        CheckBox c1 = findViewById(R.id.check_tlaxcala);
        if (c1.isChecked()) {
            count++;
        }
        CheckBox d1 = findViewById(R.id.check_vc);
        if (d1.isChecked()) {
            count++;
        }
        CheckBox e1 = findViewById(R.id.check_yucatan);
        if (e1.isChecked()) {
            count++;
        }
        CheckBox f1 = findViewById(R.id.check_zacatas);
        if (f1.isChecked()) {
            count++;
        }

        return count;
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_ac);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("1", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_bc);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("2", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_bcs);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("3", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_campeche);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("4", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_chipas);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("5", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_chihuahua);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("6", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_coahuila);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("7", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_colima);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("8", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_durango);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("9", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_guanajuato);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("10", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_guerrero);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("11", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_hidalgo);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("12", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_jalisco);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("13", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_mexico);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("14", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_mexicocity);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("15", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_michoacan);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("16", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_morelos);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("17", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nayarit);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("18", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_nl);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("19", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_oaxaca);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("20", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_puebla);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("21", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_queretaro);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("22", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_qr);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("23", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_slp);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("24", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_sinaloa);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("25", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_sonora);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("26", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_tabasco);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("27", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_tamaulipas);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("28", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_tlaxcala);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("29", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_vc);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("30", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_yucatan);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("31", a.isChecked());
        myEdit.apply();
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
        TextView tv = (TextView) findViewById(R.id.percent_mexico);
        tv.setText(countMexico +"/32");
        SharedPreferences sharedPreferences = getSharedPreferences("sharedpreferences", MODE_PRIVATE);
        CheckBox a = (CheckBox) findViewById(R.id.check_zacatas);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();
        myEdit.putBoolean("32", a.isChecked());
        myEdit.apply();
    }
}