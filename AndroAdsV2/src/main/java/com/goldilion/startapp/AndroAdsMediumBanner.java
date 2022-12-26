package com.aliendroid.alienads;

import android.app.Activity;
import android.view.View;
import android.widget.RelativeLayout;

import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAdmob;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAlienMediation;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAlienView;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerApplovinDiscovery;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerApplovinMax;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerFacebook;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerGoogle;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerIronSource;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerStartApp;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.Mrec;

public class AndroAdsMediumBanner {
    public static Mrec startAppMrec;
    public static OnLoadBannerAdmob onLoadBannerAdmob;
    public static OnLoadBannerGoogle onLoadBannerGoogle;
    public static OnLoadBannerFacebook onLoadBannerFacebook;
    public static OnLoadBannerApplovinDiscovery onLoadBannerApplovinDiscovery;
    public static OnLoadBannerApplovinMax onLoadBannerApplovinMax;
    public static OnLoadBannerStartApp onLoadBannerStartApp;
    public static OnLoadBannerIronSource onLoadBannerIronSource;
    public static OnLoadBannerAlienView onLoadBannerAlienView;
    public static OnLoadBannerAlienMediation onLoadBannerAlienMediation;

    public static void MediumBannerAdmob(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {
    }

    public static void MediumBannerGoogleAds(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }


    public static void MediumBannerFAN(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void MediumBannerApplovinDisHPK(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup, String HPK1,
                                                  String HPK2, String HPK3, String HPK4, String HPK5) {
    }

    public static void MediumBannerApplovinDis(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void MediumBannerApplovinMax(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerMopub(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void MediumBannerStartApp(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
        startAppMrec = new Mrec(activity, new BannerListener() {
            @Override
            public void onReceiveAd(View view) {
                if (onLoadBannerStartApp != null) {
                    onLoadBannerStartApp.onReceiveAd();
                }
            }

            @Override
            public void onFailedToReceiveAd(View view) {
                if (onLoadBannerStartApp != null) {
                    onLoadBannerStartApp.onFailedToReceiveAd("");
                }
            }

            @Override
            public void onImpression(View view) {
                if (onLoadBannerStartApp != null) {
                    onLoadBannerStartApp.onImpression();
                }
            }

            @Override
            public void onClick(View view) {
                if (onLoadBannerStartApp != null) {
                    onLoadBannerStartApp.onClick();
                }
            }
        });
        RelativeLayout.LayoutParams bannerParameters =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);
        bannerParameters.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layAds.addView(startAppMrec, bannerParameters);
    }

    public static void MediumBannerIron(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {
    }

    public static void MediumBannerUnity(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

    public static void MediumBannerAlienMediation(Activity activity, RelativeLayout layAds, String selectAdsBackup, String idBanner, String idBannerBackup) {

    }

}
