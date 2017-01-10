package com.srijan.motosports.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class SrijanApplication extends Application {
    public SrijanApplication() {
        super();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        LeakCanary.install(this);
    }
}

