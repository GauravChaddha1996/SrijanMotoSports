package com.srijan.motosports.features.spareparts;

/**
 * Created by pari on 12-01-2017.
 */
import android.graphics.Bitmap;
public class SparePartsChildItem {
    String heading,details;
    double price;
    String image;
    SparePartsChildItem(String heading, String details, double price,String image)
    {
        this.heading=heading;
        this.details=details;
        this.price=price;
        this.image = image;
    }
    String getHeading()
    {
        return heading;
    }
    String getDetails()
    {
        return details;
    }
    double getPrice()
    {
        return price;
    }
    String getImage(){return image;}
    public void setImage(String image){this.image = image;}

    public void setDetails(String details) {
        this.details = details;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
