package com.example.northamericanlicenseplategame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class PlateAdapter extends ArrayAdapter<Plate> {



    public PlateAdapter(Context context, ArrayList<Plate> plates) {
        super(context, 0, plates);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Plate currentPlate = getItem(position);

        CheckBox plateCheckBox = (CheckBox) listItemView.findViewById(R.id.check_view);
        plateCheckBox.setText(currentPlate.getPlate());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlate.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentPlate.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
