package com.goldilion.startapp;

import android.app.Activity;

import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsAdmob;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsAlienView;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsApplovinDiscovery;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsApplovinMax;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsGoogle;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsIronSource;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsStartApp;
import com.goldilion.startapp.interfaces.rewards.show.OnShowRewardsAdmob;
import com.goldilion.startapp.interfaces.rewards.show.OnShowRewardsAlienMedition;
import com.goldilion.startapp.interfaces.rewards.show.OnShowRewardsAlienView;
import com.goldilion.startapp.interfaces.rewards.show.OnShowRewardsApplovinDiscovery;
import com.goldilion.startapp.interfaces.rewards.show.OnShowRewardsGoogle;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.VideoListener;

public class AndroAdsReward {
    public static StartAppAd rewardedVideo;
    public static boolean unlockreward = false;
    public static OnLoadRewardsAdmob onLoadRewardsAdmob;
    public static OnLoadRewardsStartApp onLoadRewardsStartApp;
    public static OnLoadRewardsGoogle onLoadRewardsGoogle;
    public static OnLoadRewardsApplovinDiscovery onLoadRewardsApplovinDiscovery;
    public static OnLoadRewardsApplovinMax onLoadRewardsApplovinMax;
    public static OnLoadRewardsIronSource onLoadRewardsIronSource;
    public static OnLoadRewardsAlienView onLoadRewardsAlienView;

    public static OnShowRewardsAdmob onShowRewardsAdmob;
    public static OnShowRewardsGoogle onShowRewardsGoogle;
    public static OnShowRewardsApplovinDiscovery onShowRewardsApplovinDiscovery;
    public static OnShowRewardsAlienMedition onShowRewardsAlienMedition;
    public static OnShowRewardsAlienView onShowRewardsAlienView;
    public static void LoadRewardAdmob(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardAlienMediation(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardAlienView(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardUnity(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardGoogleAds(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }


    public static void LoadRewardApplovinMax(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardApplovinDis(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardMopub(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {

    }

    public static void LoadRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void LoadRewardStartApp(Activity activity, String selectBackupAds, String idReward, String idBackupReward) {
        try {
            rewardedVideo = new StartAppAd(activity);
            rewardedVideo.setVideoListener(new VideoListener() {
                @Override
                public void onVideoCompleted() {
                    if (onLoadRewardsStartApp!=null){
                        onLoadRewardsStartApp.onVideoCompleted();
                    }
                    unlockreward = true;
                }
            });

            rewardedVideo.loadAd(StartAppAd.AdMode.REWARDED_VIDEO, new AdEventListener() {
                @Override
                public void onReceiveAd(com.startapp.sdk.adsbase.Ad ad) {
                    if (onLoadRewardsStartApp!=null){
                        onLoadRewardsStartApp.onReceiveAd();
                    }

                }

                @Override
                public void onFailedToReceiveAd(com.startapp.sdk.adsbase.Ad ad) {
                    if (onLoadRewardsStartApp!=null){
                        onLoadRewardsStartApp.onFailedToReceiveAd();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void ShowRewardAdmob(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardGoogleAds(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardApplovinMax(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardApplovinDis(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardMopub(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardIron(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }

    public static void ShowRewardUnity(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardStartApp(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
        try {
            if (rewardedVideo.isReady()) {
                rewardedVideo.showAd();
            } else {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        LoadRewardStartApp(activity, selecBackuptAds, idReward, idBackupReward);
    }

    public static void ShowRewardAlienView(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {
    }

    public static void ShowRewardAlienMediation(Activity activity, String selecBackuptAds, String idReward, String idBackupReward) {

    }
}
