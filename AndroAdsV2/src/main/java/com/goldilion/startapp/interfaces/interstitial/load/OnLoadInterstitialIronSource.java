package com.goldilion.startapp.interfaces.interstitial.load;

public interface OnLoadInterstitialIronSource {
    void onInterstitialAdReady();
    void onInterstitialAdLoadFailed();
    void onInterstitialAdOpened();
    void onInterstitialAdClosed();
    void onInterstitialAdShowFailed();
    void onInterstitialAdClicked();
    void onInterstitialAdShowSucceeded();
}
