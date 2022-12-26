package com.goldilion.startapp.interfaces.banner;

public interface OnLoadBannerIronSource {
    void onBannerAdLoaded();
    void onBannerAdLoadFailed();
    void onBannerAdClicked();
    void onBannerAdScreenPresented();
    void onBannerAdScreenDismissed();
    void onBannerAdLeftApplication();

}
