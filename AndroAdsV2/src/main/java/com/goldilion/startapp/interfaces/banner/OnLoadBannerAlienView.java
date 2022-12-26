package com.goldilion.startapp.interfaces.banner;

public interface OnLoadBannerAlienView {
    void onBannerAdLoaded();
    void onBannerAdClicked();
    void onBannerAdFailedToLoad(String error);
}
