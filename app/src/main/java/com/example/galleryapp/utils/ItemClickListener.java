package com.example.galleryapp.utils;

import java.util.ArrayList;

public interface ItemClickListener {
    void onPictureClicked(PictureHolder holder, int position, ArrayList<PictureFacer> picture);
    void onPictureClicked(String picturePath, String folderName);
}
