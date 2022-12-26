package com.goldilion.familymultiads;

import android.app.Application;
import android.util.Log;

import com.goldilion.sdkads.config.AppsConfig;
import com.goldilion.sdkads.config.InitializeAlienAds;
//import com.applovin.sdk.AppLovinMediationProvider;
//import com.applovin.sdk.AppLovinSdk;
import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryPerformance;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MyApplication extends Application {
    private static AndroAdsOpenAds alienOpenAds;
    private static InitializeAlienAds sdkads;
    private static AndroAdsNotif notif;

    //Uranus
    @Override
    public void onCreate() {
        super.onCreate();
//        AppLovinSdk.getInstance(MyApplication.this).setMediationProvider(AppLovinMediationProvider.MAX);
//        AppLovinSdk.getInstance(MyApplication.this).initializeSdk(config -> {
//        });
//        MobileAds.initialize(
//                this,
//                new OnInitializationCompleteListener() {
//                    @Override
//                    public void onInitializationComplete(InitializationStatus initializationStatus) {
//                    }
//                });


        new FlurryAgent.Builder()
                .withDataSaleOptOut(false)
                .withCaptureUncaughtExceptions(true)
                .withIncludeBackgroundSessionsInMetrics(true)
                .withLogLevel(Log.VERBOSE)
                .withPerformanceMetrics(FlurryPerformance.ALL)
                .build(this, AppsConfig.ANALYSKEY);

        sdkads = new InitializeAlienAds(this);
//        alienOpenAds = new AndroAdsOpenAds(this);
        notif = new AndroAdsNotif(this);

    }
}