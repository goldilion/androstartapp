package com.goldilion.startapp.interfaces.interstitial.load;

public interface OnLoadInterstitialStartApp {
    void onReceiveAd();
    void onFailedToReceiveAd(String error);
}
