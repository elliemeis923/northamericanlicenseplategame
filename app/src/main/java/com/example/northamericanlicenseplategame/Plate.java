package com.example.northamericanlicenseplategame;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Plate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);


    }

    private String plate;
    private int ImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Plate(String plate) {
        this.plate = plate;
    }

    public Plate(String plate, int ImageResourceId) {
        this.plate = plate;
        this.ImageResourceId = ImageResourceId;
    }

    public String getPlate() {
        return plate;
    }

    public int getImageResourceId() {
        return ImageResourceId;
    }

    public boolean hasImage() {
        return ImageResourceId != NO_IMAGE_PROVIDED;
    }
}
