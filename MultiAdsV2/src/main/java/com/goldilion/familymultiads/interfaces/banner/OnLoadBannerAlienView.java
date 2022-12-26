package com.goldilion.familymultiads.interfaces.banner;

public interface OnLoadBannerAlienView {
    void onBannerAdLoaded();
    void onBannerAdClicked();
    void onBannerAdFailedToLoad(String error);
}
