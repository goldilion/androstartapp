package com.goldilion.familymultiads.interfaces.banner;

public interface OnLoadBannerStartApp {
    void onReceiveAd();
    void onFailedToReceiveAd(String error);
    void onImpression();
    void onClick();

}
