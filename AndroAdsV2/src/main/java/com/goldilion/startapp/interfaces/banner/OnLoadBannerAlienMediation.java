package com.goldilion.startapp.interfaces.banner;

public interface OnLoadBannerAlienMediation {
    void onBannerAdLoaded();
    void onBannerAdClicked();
    void onBannerAdFailedToLoad(String error);
}
