package com.aliendroid.alienads;

import android.app.Application;
import android.util.Log;

import com.aliendroid.sdkads.config.InitializeAlienAds;

import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;


public class MyApplication extends Application {
    private static AlienOpenAds alienOpenAds;
    private static InitializeAlienAds sdkads;
    //Uranus
    @Override
    public void onCreate() {
        super.onCreate();
        new FlurryAgent.Builder()
                .withDataSaleOptOut(false)
                .withCaptureUncaughtExceptions(true)
                .withIncludeBackgroundSessionsInMetrics(true)
                .withLogLevel(Log.VERBOSE)
                .withPerformanceMetrics(FlurryPerformance.ALL)
                .build(this, "GDHK2VXHW26NGXY4HHTB");

        sdkads = new InitializeAlienAds(this);
        alienOpenAds = new AlienOpenAds(this);


    }
}