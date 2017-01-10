package com.srijan.motosports.database;

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
}

