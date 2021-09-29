package com.example.galleryapp.utils;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.galleryapp.R;

public class PictureHolder extends RecyclerView.ViewHolder {
    public ImageView picture;

    PictureHolder(View itemView) {
        super(itemView);

        picture = itemView.findViewById(R.id.image);
    }
}
