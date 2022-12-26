package com.goldilion.familymultiads.interfaces.banner;

public interface OnLoadBannerAlienMediation {
    void onBannerAdLoaded();
    void onBannerAdClicked();
    void onBannerAdFailedToLoad(String error);
}
