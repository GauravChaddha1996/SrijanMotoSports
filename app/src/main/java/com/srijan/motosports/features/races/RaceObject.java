package com.srijan.motosports.features.races;

/**
 * Created by pari on 17-01-2017.
 */

public class RaceObject {
    String carName,driver,fastestLapTime,points,numRaces;
    public RaceObject(String carName,String driver,String fastestLapTime ,String numRaces,String points)
    {
        this.carName=carName;
        this.driver =driver;
        this.fastestLapTime=fastestLapTime;
        this.points=points;
        this.numRaces=numRaces;
    }

    public String getFastestLapTime() {
        return fastestLapTime;
    }

    public String getPoints() {
        return points;
    }

    public String getNumRaces() {
        return numRaces;
    }

    public void setFastestLapTime(String fastestLapTime) {
        this.fastestLapTime = fastestLapTime;
    }

    public void setNumRaces(String numRaces) {
        this.numRaces = numRaces;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getDriver() {
        return driver;
    }

    public String getCarName() {
        return carName;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }
}
