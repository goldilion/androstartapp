package com.goldilion.sdkads.interfaces;

public interface OnLoadInterstitialMediation {
    void onInterstitialAdLoaded();
    void onInterstitialAdClosed();
    void onInterstitialAdClicked();
    void onInterstitialAdFailedToLoad(String error);
}
