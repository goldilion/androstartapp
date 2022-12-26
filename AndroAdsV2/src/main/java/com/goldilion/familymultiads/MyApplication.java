package com.goldilion.familymultiads;

import android.app.Application;
import android.util.Log;

import com.goldilion.sdkads.config.InitializeAlienAds;

import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;


public class MyApplication extends Application {
    private static AndroAdsOpenAds alienOpenAds;
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
        alienOpenAds = new AndroAdsOpenAds(this);


    }
}