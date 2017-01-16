<<<<<<< HEAD
package com.srijan.motosports.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.observables.ConnectableObservable;

public class SrijanApplication extends Application {
    static ConnectableObservable<Long> raceTimerObservable;

    public SrijanApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
        startRaceTimer();
    }

    private void startRaceTimer() {
        raceTimerObservable = Observable.interval(1, TimeUnit.SECONDS).publish();
        raceTimerObservable.connect();
    }

    public static ConnectableObservable<Long> getRaceTimerObservable() {
        return raceTimerObservable;
    }
}

