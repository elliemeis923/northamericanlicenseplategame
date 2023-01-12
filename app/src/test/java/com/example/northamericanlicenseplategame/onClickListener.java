package com.example.northamericanlicenseplategame;

import android.view.View;
import android.widget.Toast;

public class onClickListener {

    public void onClick(View view){
        Toast.makeText(view.getContext(),
                "Open the home screen", Toast.LENGTH_SHORT).show();
    }
}
