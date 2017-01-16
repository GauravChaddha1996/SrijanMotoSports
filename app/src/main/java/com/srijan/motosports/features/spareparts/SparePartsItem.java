package com.srijan.motosports.features.spareparts;

/**
 * Created by pari on 12-01-2017.
 */

import android.graphics.Bitmap;

import java.util.List;

public class SparePartsItem {
    String name;
  //  Bitmap image;
    int childSize;
    List<SparePartsChildItem> sparePartsChildItems;
    SparePartsItem(String name, int childSize, List<SparePartsChildItem> sparePartsChildItems)
    {
        this.name = name;
     //   this.image = image;
        this.childSize = childSize;
        this.sparePartsChildItems = sparePartsChildItems;
    }
    int getChildSize()
    {
        return childSize;
    }
    SparePartsChildItem getChildAtPosition(int position)
    {
        return sparePartsChildItems.get(position);
    }
    String getName()
    {
        return name;
    }
  //  Bitmap getImage()
    /*{
        return image;
    }*/

    public void setChildSize(int childSize) {
        this.childSize = childSize;
    }

    /*public void setImage(Bitmap image) {
        this.image = image;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setSparePartsChildItems(List<SparePartsChildItem> sparePartsChildItems) {
        this.sparePartsChildItems = sparePartsChildItems;
    }
}
