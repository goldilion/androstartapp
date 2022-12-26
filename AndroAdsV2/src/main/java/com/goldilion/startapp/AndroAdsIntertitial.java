package com.goldilion.startapp;

import android.app.Activity;

import com.goldilion.startapp.interfaces.interstitial.admob.OnFullScreenContentCallbackAdmob;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialAdmob;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialAlienMediation;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialAlienView;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialApplovinDiscovery;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialApplovinMax;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialFacebook;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialGoogle;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialIronSource;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialStartApp;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialAdmob;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialAlienMediation;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialAlienView;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialApplovinDiscovery;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialApplovinMax;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialFacebook;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialGoogle;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialIronSource;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialStartApp;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

public class AndroAdsIntertitial {
    private static StartAppAd startAppAd;
    public static OnLoadInterstitialAdmob onLoadInterstitialAdmob;
    public static OnShowInterstitialAdmob onShowInterstitialAdmob;

    public static OnShowInterstitialGoogle onShowInterstitialGoogle;
    public static OnLoadInterstitialGoogle onLoadInterstitialGoogle;

    public static OnLoadInterstitialFacebook onLoadInterstitialFacebook;
    public static OnShowInterstitialFacebook onShowInterstitialFacebook;

    public static OnLoadInterstitialApplovinDiscovery onLoadInterstitialApplovinDiscovery;
    public static OnShowInterstitialApplovinDiscovery onShowInterstitialApplovinDiscovery;

    public static OnLoadInterstitialApplovinMax onLoadInterstitialApplovinMax;
    public static OnShowInterstitialApplovinMax onShowInterstitialApplovinMax;

    public static OnLoadInterstitialIronSource onLoadInterstitialIronSource;
    public static OnShowInterstitialIronSource onShowInterstitialIronSource;

    public static OnLoadInterstitialStartApp onLoadInterstitialStartApp;
    public static OnShowInterstitialStartApp onShowInterstitialStartApp;

    public static OnLoadInterstitialAlienMediation onLoadInterstitialAlienMediation;
    public static OnLoadInterstitialAlienView onLoadInterstitialAlienView;

    public static OnShowInterstitialAlienMediation onShowInterstitialAlienMediation;
    public static OnShowInterstitialAlienView onShowInterstitialAlienView;

    public static OnFullScreenContentCallbackAdmob onFullScreenContentCallbackAdmob;
    private static int counter;

    public static boolean SHOW_ALIEN_VIEW = false;

    public static void LoadIntertitialUnity(Activity activity, String selectAds, String idIntertitial, String idBackupIntertitial) {

    }

    public static void LoadIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void LoadIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup
    ) {
    }

    public static void LoadIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5
    ) {

    }

    public static void LoadIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
    }

    public static void LoadIntertitialStartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {
        startAppAd = new StartAppAd(activity);
        startAppAd.loadAd(new AdEventListener() {
            @Override
            public void onReceiveAd(Ad ad) {
                if (onLoadInterstitialStartApp != null) {
                    onLoadInterstitialStartApp.onReceiveAd();
                }

            }

            @Override
            public void onFailedToReceiveAd(Ad ad) {
                if (onLoadInterstitialStartApp != null) {
                    onLoadInterstitialStartApp.onFailedToReceiveAd("");
                }
            }
        });
    }

    public static void LoadIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void LoadIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup) {

    }

    public static void ShowIntertitialAdmob(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval, String Hpk1,
                                            String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void ShowIntertitialGoogleAds(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {

    }

    public static void ShowIntertitialApplovinDis(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {

    }

    public static void ShowIntertitialApplovinDisHPK(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval, String HPK1,
                                                     String HPK2, String HPK3, String HPK4, String HPK5) {
    }

    public static void ShowIntertitialApplovinMax(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                  int interval) {

    }

    public static void ShowIntertitialIron(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                           int interval) {

    }

    public static void ShowIntertitialMopub(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {

    }


    public static void ShowIntertitialSartApp(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                              int interval) {
        if (counter >= interval) {
            startAppAd.showAd();
            startAppAd.showAd(new AdDisplayListener() {
                @Override
                public void adHidden(Ad ad) {
                    if (onShowInterstitialStartApp != null) {
                        onShowInterstitialStartApp.adHidden();
                    }
                }

                @Override
                public void adDisplayed(Ad ad) {
                    if (onShowInterstitialStartApp != null) {
                        onShowInterstitialStartApp.adDisplayed();
                    }
                }

                @Override
                public void adClicked(Ad ad) {
                    if (onShowInterstitialStartApp != null) {
                        onShowInterstitialStartApp.adClicked();
                    }
                }

                @Override
                public void adNotDisplayed(Ad ad) {
                    if (onShowInterstitialStartApp != null) {
                        onShowInterstitialStartApp.adNotDisplayed();
                    }
                }
            });

            LoadIntertitialStartApp(activity, selectAdsBackup, idIntertitial, idIntertitialBackup);
            counter = 0;
        } else {
            counter++;
        }

    }

    public static void ShowIntertitialFAN(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                          int interval) {
    }

    public static void ShowIntertitialUnity(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                            int interval) {

    }

    public static void ShowIntertitialAlienView(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                int interval) {
    }

    public static void ShowIntertitialAlienMediation(Activity activity, String selectAdsBackup, String idIntertitial, String idIntertitialBackup,
                                                     int interval) {

    }
}
