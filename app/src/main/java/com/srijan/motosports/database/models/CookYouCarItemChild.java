package com.srijan.motosports.database.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Batdroid on 14/1/17 for Srijan.
 */

public class CookYouCarItemChild implements Parcelable {
    public static final Creator<CookYouCarItemChild> CREATOR = new Creator<CookYouCarItemChild>() {
        @Override
        public CookYouCarItemChild createFromParcel(Parcel in) {
            return new CookYouCarItemChild(in);
        }

        @Override
        public CookYouCarItemChild[] newArray(int size) {
            return new CookYouCarItemChild[size];
        }
    };
    private String title;
    private String description;
    private double cost;

    public CookYouCarItemChild(String title, String description, double cost) {
        this.title = title;
        this.description = description;
        this.cost = cost;
    }

    protected CookYouCarItemChild(Parcel in) {
        title = in.readString();
        description = in.readString();
        cost = in.readDouble();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(description);
        parcel.writeDouble(cost);
    }
}
