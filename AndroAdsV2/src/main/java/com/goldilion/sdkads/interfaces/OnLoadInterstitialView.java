package com.goldilion.sdkads.interfaces;

public interface OnLoadInterstitialView {
    void onInterstitialAdLoaded();
    void onInterstitialAdClosed();
    void onInterstitialAdClicked();
    void onInterstitialAdFailedToLoad(String error);
}
