package com.example.shrisha.newsapp;

import android.graphics.Bitmap;

/**
 * Created by shrisha on 8/10/17.
 */

public class News {

    public News(String newsTitle, String newsUrl, Bitmap bitmap, String newsDescription) {
        this.newsTitle = newsTitle;
        this.newsUrl = newsUrl;
        this.bitmap = bitmap;
        this.newsDescription = newsDescription;
    }

    private String newsTitle;
    private String newsDescription;
    private String newsUrl;
    private Bitmap bitmap;

    public String getNewsDescription() {
        return newsDescription;
    }

    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public Bitmap getImageBitmap() {
        return bitmap;
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
