package com.example.northamericanlicenseplategame;

public class Plate {

    private String plate;
    private int ImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Plate(String plate){
        this.plate = plate;
    }

    public Plate(String plate, int ImageResourceId){
        this.plate = plate;
        this.ImageResourceId = ImageResourceId;
    }

    public String getPlate(){return plate;}
    public int getImageResourceId(){return ImageResourceId;}

    public boolean hasImage(){return ImageResourceId != NO_IMAGE_PROVIDED;}
}
