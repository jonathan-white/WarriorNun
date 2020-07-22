package com.example.android.warriornun;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class Nun {
    private String mName;
    private int mHeaderImage;
    private int mMainImage;
    private int mThumbnail;
    private String mSummary;

    public Nun(String name, int headerImage, int mainImage, int thumbnail, String summary) {
        mName = name;
        mHeaderImage = headerImage;
        mMainImage = mainImage;
        mThumbnail = thumbnail;
        mSummary = summary;
    }

    /**
     *  Returns the nun's name
     *
     * @return mName
     */
    public String getName(){
        return mName;
    }

    /**
     *  Returns the header image for the nun's bio page
     *
     * @return mHeaderImage
     */
    public int getHeaderImage(){
        return mHeaderImage;
    }

    /**
     *  Returns the background image for the nun's preview page
     *
     * @return mMainImage
     */
    public int getMainImage(){
        return mMainImage;
    }

    /**
     *  Returns the nun's avatar image
     *
     * @return mThumbnail
     */
    public int getThumbnail(){
        return mThumbnail;
    }

    /**
     *  Returns the nun's bio
     *
     * @return mSummary
     */
    public String getSummary(){
        return mSummary;
    }
}
