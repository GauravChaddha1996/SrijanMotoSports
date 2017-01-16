package com.srijan.motosports.features.spareparts;

/**
 * Created by pari on 12-01-2017.
 */
import android.graphics.Bitmap;
public class SparePartsChildItem {
    String heading,details;
    double price;
    Bitmap image;
    SparePartsChildItem(String heading, String details, double price,Bitmap image)
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
    Bitmap getImage(){return image;}
    public void setImage(Bitmap image){this.image = image;}

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
