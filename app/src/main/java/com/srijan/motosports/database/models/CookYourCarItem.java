package com.srijan.motosports.database.models;

import android.os.Parcel;

import com.thoughtbot.expandablecheckrecyclerview.models.SingleCheckExpandableGroup;

import java.util.List;

/**
 * Created by Batdroid on 14/1/17 for Srijan.
 */

public class CookYourCarItem extends SingleCheckExpandableGroup{
    String groupName;
    public CookYourCarItem(String title, List items) {
        super(title, items);
        groupName = title;
    }

    public CookYourCarItem(Parcel in) {
        super(in);
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }
    public static final Creator<CookYourCarItem> CREATOR = new Creator<CookYourCarItem>() {
        @Override
        public CookYourCarItem createFromParcel(Parcel in) {
            return new CookYourCarItem(in);
        }

        @Override
        public CookYourCarItem[] newArray(int size) {
            return new CookYourCarItem[size];
        }
    };
}
