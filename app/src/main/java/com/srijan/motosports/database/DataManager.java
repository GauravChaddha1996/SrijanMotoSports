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
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("Fox DHX", "5.0", 210));
        childObjects.add(new CookYouCarItemChild("Ohlins TTX", "25", 450));
        childObjects.add(new CookYouCarItemChild("Ohlins TTX", "36", 500));
        childObjects.add(new CookYouCarItemChild("Quantum(Two zroo)", "Two way adjustable", 325));
        cookYourCarItem = new CookYourCarItem("Damper", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("Aluminium Material", "", 200));
        childObjects.add(new CookYouCarItemChild("ABS Material", "Double layer of CFRP", 180));
        childObjects.add(new CookYouCarItemChild("Carbon Fibre Material", "", 300));
        childObjects.add(new CookYouCarItemChild("ABS steering steel material", "Double layer of GFRP", 180));
        cookYourCarItem = new CookYourCarItem("Steering Material", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("Aluminium Steering wheel", "Button and paddle shifter", 400));
        childObjects.add(new CookYouCarItemChild("ABS steering", "Button, paddle, digital display,sensor reading and control", 450));
        childObjects.add(new CookYouCarItemChild("Carbon Fibre steering", "Button, paddle, digital display,sensor reading and control, gc control", 700));
        cookYourCarItem = new CookYourCarItem("Steering Wheel", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("GFRP", "Comfortable, not stylish", 200));
        childObjects.add(new CookYouCarItemChild("CFRP", "Stylish", 250));
        childObjects.add(new CookYouCarItemChild("GFRP Seat", "Combined with firewall & Cabin", 500));
        childObjects.add(new CookYouCarItemChild("CFRP Seat", "Combined with firewall & Cabin", 600));
        cookYourCarItem = new CookYourCarItem("Seat", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("Bridgestone", "", 50));
        childObjects.add(new CookYouCarItemChild("Hoosier", "", 85));
        childObjects.add(new CookYouCarItemChild("Avon", "", 100));
        childObjects.add(new CookYouCarItemChild("Dunlop motosport", "", 150));
        cookYourCarItem = new CookYourCarItem("Tires", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("GFRP", "Piece wise Color black", 50));
        childObjects.add(new CookYouCarItemChild("GFRP", "Piece wise Color grey", 40));
        childObjects.add(new CookYouCarItemChild("GFRP", "Piece wise Color black aerodynamic", 80));
        childObjects.add(new CookYouCarItemChild("CFRP", "Piece wise Color black", 60));
        childObjects.add(new CookYouCarItemChild("CFRP", "Piece wise Color grey", 50));
        childObjects.add(new CookYouCarItemChild("CFRP", "Piece wise Color black aerodynamic", 90));
        childObjects.add(new CookYouCarItemChild("CFRP", "Single Piece Color black", 30));
        childObjects.add(new CookYouCarItemChild("CFRP", "Single Piece Color grey", 40));
        childObjects.add(new CookYouCarItemChild("CFRP", "Single Piece Color black aerodynamic", 55));
        cookYourCarItem = new CookYourCarItem("Body Works", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("Material: GFRP", "With starter and kill switch", 200));
        childObjects.add(new CookYouCarItemChild("Material: CFRP", "With starter and kill switch", 250));
        childObjects.add(new CookYouCarItemChild("Material: CFRP", "With starter, kill switch and digital display",320));
        cookYourCarItem = new CookYourCarItem("DashBoard", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);
        childObjects = new ArrayList<>();

        childObjects.add(new CookYouCarItemChild("Material: GFRP", "With Plenum", 500));
        childObjects.add(new CookYouCarItemChild("Material: CFRP", "With Plenum", 600));
        childObjects.add(new CookYouCarItemChild("Material: Aluminium", "With Plenum",530));
        cookYourCarItem = new CookYourCarItem("Intake", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);

        childObjects = new ArrayList<>();
        childObjects.add(new CookYouCarItemChild("Material: GFRP", "With Selenum", 130));
        childObjects.add(new CookYouCarItemChild("Material: CFRP", "With Selenum", 150));
        childObjects.add(new CookYouCarItemChild("Material: Aluminium", "With Selenum", 400));
        cookYourCarItem = new CookYourCarItem("Exhaust", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);

        childObjects = new ArrayList<>();
        childObjects.add(new CookYouCarItemChild("Stock ECU", "Company stock", 600));
        childObjects.add(new CookYouCarItemChild("Race Dynamics ECU ", "With GFRP", 700));
        childObjects.add(new CookYouCarItemChild("Race Dynamics ECU ", "With CFRP", 750));
        cookYourCarItem = new CookYourCarItem("ECU", childObjects);
        cookYourCarItem.checkChild(0);
        parentObjects.add(cookYourCarItem);

        return parentObjects;
    }
}

