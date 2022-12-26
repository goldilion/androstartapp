package com.goldilion.familymultiads.interfaces.banner;

public interface OnLoadBannerAdmob {
    void onAdLoaded();
    void onAdFailedToLoad(String error);
    void onAdOpened();
    void onAdClicked();
    void onAdClosed();
}
