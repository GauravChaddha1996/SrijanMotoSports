package com.srijan.motosports.database;

import com.srijan.motosports.database.models.CookYouCarItemChild;
import com.srijan.motosports.database.models.CookYourCarItem;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager dataManager;

    private DataManager() {

    }

    public static DataManager getDataManager() {
        if (dataManager == null) {
            dataManager = new DataManager();
        }
        return dataManager;
    }

    public ArrayList<CookYourCarItem> getCookYourCarItems() {
        ArrayList<CookYourCarItem> parentObjects = new ArrayList<>();
        List<CookYouCarItemChild> childObjects = new ArrayList<>();
        childObjects.add(new CookYouCarItemChild("Hiper Racing", "Carbon Plastic CFI - 10 inch", 37.5));
        childObjects.add(new CookYouCarItemChild("Keizer Wheels", "10 inch", 77.5));
        childObjects.add(new CookYouCarItemChild("O.Z. Wheels", "10 inch", 150));
        childObjects.add(new CookYouCarItemChild("DWT Wheels", "AI 001-05 10 inch", 63));
        CookYourCarItem cookYourCarItem = new CookYourCarItem("Wheels", childObjects);
        parentObjects.add(cookYourCarItem);
        childObjects.clear();

        childObjects.add(new CookYouCarItemChild("Fox DHX", "5.0", 210));
        childObjects.add(new CookYouCarItemChild("Ohlins TTX", "25", 450));
        childObjects.add(new CookYouCarItemChild("Ohlins TTX", "36", 500));
        childObjects.add(new CookYouCarItemChild("Quantum(Two zroo)", "Two way adjustable", 325));
        cookYourCarItem = new CookYourCarItem("Damper", childObjects);
        parentObjects.add(cookYourCarItem);
        return parentObjects;
    }
}

