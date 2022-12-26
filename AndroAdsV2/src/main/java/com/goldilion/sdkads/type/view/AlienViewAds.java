package com.goldilion.sdkads.type.view;

import android.app.Activity;
import android.widget.RelativeLayout;

import com.goldilion.sdkads.interfaces.OnLoadBannerView;
import com.goldilion.sdkads.interfaces.OnLoadInterstitialView;
import com.goldilion.sdkads.interfaces.OnLoadRewardsView;
import com.goldilion.sdkads.interfaces.OnOpenViewAdListener;
import com.goldilion.sdkads.interfaces.OnShowInterstitialView;
import com.goldilion.sdkads.interfaces.OnShowRewardsView;

public class AlienViewAds {
    public static OnLoadBannerView onLoadBannerView;
    public static OnOpenViewAdListener onOpenViewAdListener;
    public static OnLoadInterstitialView onLoadInterstitialView;
    public static OnLoadRewardsView onLoadRewardsView;
    public static OnShowInterstitialView onShowInterstitialView;
    public static OnShowRewardsView onShowRewardsView;

    public static void Banner (Activity activity, RelativeLayout layAds, String AppID) {

    }

    public static void OpenApp (Activity activity, String AppID) {

    }

    public static void Interstitial (Activity activity, String AppID) {

    }

    public static void RewardsAds (Activity activity, String AppID) {

    }

    public static void ShowIntertitial (){

    }

    public static void ShowRewards (){

    }
}
