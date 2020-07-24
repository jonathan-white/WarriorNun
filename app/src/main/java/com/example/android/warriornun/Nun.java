package com.example.android.warriornun;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

public class Nun {
    private int mName;
    private int mHeaderImage;
    private int mMainImage;
    private int mThumbnail;
    private int mSummary;

    public Nun(int name, int headerImage, int mainImage, int thumbnail, int summary) {
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
    public int getName(){
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
    public int getSummary(){
        return mSummary;
    }

    @Override
    public String toString() {
        return "Nun{" +
                "mName=" + mName +
                ", mHeaderImage=" + mHeaderImage +
                ", mMainImage=" + mMainImage +
                ", mThumbnail=" + mThumbnail +
                ", mSummary=" + mSummary +
                '}';
    }
}
