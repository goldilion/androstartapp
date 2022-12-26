package com.goldilion.familymultiads.interfaces.interstitial.load;

public interface OnLoadInterstitialStartApp {
    void onReceiveAd();
    void onFailedToReceiveAd(String error);
}
