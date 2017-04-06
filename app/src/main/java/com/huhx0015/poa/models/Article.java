package com.huhx0015.poa.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Article implements Parcelable {

    /** CLASS VARIABLES ________________________________________________________________________ **/

    private String mAuthor;
    private String mTitle;
    private String mDescription;
    private String mUrl;
    private String mUrlToImage;
    private String mPublishedAt;

    /** PARCELABLE METHODS _____________________________________________________________________ **/

    protected Article(Parcel in) {
        mAuthor = in.readString();
        mTitle = in.readString();
        mDescription = in.readString();
        mUrl = in.readString();
        mUrlToImage = in.readString();
        mPublishedAt = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mAuthor);
        dest.writeString(mTitle);
        dest.writeString(mDescription);
        dest.writeString(mUrl);
        dest.writeString(mUrlToImage);
        dest.writeString(mPublishedAt);
    }

    public static final Creator<Article> CREATOR = new Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };

    /** GET METHODS ____________________________________________________________________________ **/

    public String getAuthor() {
        return mAuthor;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getUrlToImage() {
        return mUrlToImage;
    }

    public String getPublishedAt() {
        return mPublishedAt;
    }

    /** SET METHODS ____________________________________________________________________________ **/

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public void setUrlToImage(String urlToImage) {
        this.mUrlToImage = urlToImage;
    }

    public void setPublishedAt(String publishedAt) {
        this.mPublishedAt = publishedAt;
    }
}