package com.goldilion.familymultiads.interfaces.banner;

public interface OnLoadBannerGoogle {
    void onAdLoaded();
    void onAdFailedToLoad(String error);
    void onAdOpened();
    void onAdClicked();
    void onAdClosed();
}
