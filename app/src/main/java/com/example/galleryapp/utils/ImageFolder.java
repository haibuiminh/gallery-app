package com.example.galleryapp.utils;

public class ImageFolder {
    private String path;
    private String folderName;
    private int numberOfPictures = 0;
    private String firstPicture;

    public ImageFolder() {

    }

    public ImageFolder(String path, String folderName) {
        this.path = path;
        this.folderName = folderName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public int getNumberOfPictures() {
        return numberOfPictures;
    }

    public void setNumberOfPictures(int numberOfPictures) {
        this.numberOfPictures = numberOfPictures;
    }

    public String getFirstPicture() {
        return firstPicture;
    }

    public void setFirstPicture(String firstPicture) {
        this.firstPicture = firstPicture;
    }

    public void addPicture() {
        numberOfPictures++;
    }
}
