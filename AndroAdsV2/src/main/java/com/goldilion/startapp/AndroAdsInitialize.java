package com.goldilion.startapp;

import android.app.Activity;

import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDK;

public class AndroAdsInitialize {

    public static void SelectAdsAdmob(Activity activity, String selectAdsBackup, String idInitialize) {
    }

    public static void SelectAdsGoogleAds(Activity activity, String selectAdsBackup, String idInitialize) {
    }

    public static void SelectAdsApplovinDis(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsApplovinMax(Activity activity, String selectAdsBackup, String idInitialize) {

    }

    public static void SelectAdsMopub(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsStartApp(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {
        StartAppSDK.init(activity, idInitialize, true);
        StartAppAd.disableSplash();
        StartAppSDK.setUserConsent(activity,
                "pas",
                System.currentTimeMillis(),
                true);

    }

    public static void SelectAdsIron(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }

    public static void SelectAdsUnity(Activity activity, String selectAdsBackup, String idInitialize, String idInitializeBackupAds) {

    }


    public static void SelectAdsFAN(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {
    }

    public static void SelectAdsAlienView(Activity activity, String selectAdsBackup, String idInitializeBackupAds) {
    }

    public static void SelectAdsAlienMediation(Activity activity, String selectAdsBackup,String idInitialize, String idInitializeBackupAds) {

    }

}
