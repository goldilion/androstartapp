package com.goldilion.startapp.interfaces.interstitial.load;

public interface OnLoadInterstitialFacebook {
    void onInterstitialDisplayed();
    void onInterstitialDismissed();
    void onError();
    void onAdLoaded();
    void onAdClicked();
    void onLoggingImpression();
}
