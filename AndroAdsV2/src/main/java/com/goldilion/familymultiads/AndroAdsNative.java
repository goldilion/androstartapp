package com.goldilion.familymultiads;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.goldilion.familymultiads.interfaces.natives.OnLoadMediumNativesAdmob;
import com.goldilion.familymultiads.interfaces.natives.OnLoadMediumNativesAlien;
import com.goldilion.familymultiads.interfaces.natives.OnLoadMediumNativesApplovinMax;
import com.goldilion.familymultiads.interfaces.natives.OnLoadMediumNativesFacebook;
import com.goldilion.familymultiads.interfaces.natives.OnLoadMediumNativesStartApp;
import com.goldilion.familymultiads.interfaces.natives.OnLoadSmallNativesAdmob;
import com.goldilion.familymultiads.interfaces.natives.OnLoadSmallNativesAlien;
import com.goldilion.familymultiads.interfaces.natives.OnLoadSmallNativesApplovinMax;
import com.goldilion.familymultiads.interfaces.natives.OnLoadSmallNativesFacebook;
import com.goldilion.familymultiads.interfaces.natives.OnLoadSmallNativesStartApp;
import com.bumptech.glide.Glide;

import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.ads.nativead.StartAppNativeAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

import java.util.ArrayList;
import java.util.Iterator;

public class AndroAdsNative {

    public static StartAppNativeAd startAppNativeAd;
    public static OnLoadSmallNativesAdmob onLoadSmallNativesAdmob;
    public static OnLoadSmallNativesApplovinMax onLoadSmallNativesApplovinMax;
    public static OnLoadSmallNativesFacebook onLoadSmallNativesFacebook;
    public static OnLoadSmallNativesStartApp onLoadSmallNativesStartApp;
    public static OnLoadSmallNativesAlien onLoadSmallNativesAlien;

    public static OnLoadMediumNativesAdmob onLoadMediumNativesAdmob;
    public static OnLoadMediumNativesApplovinMax onLoadMediumNativesApplovinMax;
    public static OnLoadMediumNativesFacebook onLoadMediumNativesFacebook;
    public static OnLoadMediumNativesStartApp onLoadMediumNativesStartApp;
    public static OnLoadMediumNativesAlien onLoadMediumNativesAlien;

    public static void SmallNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                        String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void SmallNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void SmallNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void SmallNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
        startAppNativeAd = new StartAppNativeAd(activity);
        View adViewNative = (View) activity.getLayoutInflater()
                .inflate(R.layout.startapp_small_native, null);
        AdEventListener adListener = new AdEventListener() {
            @Override
            public void onReceiveAd(@NonNull com.startapp.sdk.adsbase.Ad ad) {
                if (onLoadSmallNativesStartApp !=null){
                    onLoadSmallNativesStartApp.onReceiveAd();
                }
                ArrayList ads = startAppNativeAd.getNativeAds();    // get NativeAds list
                Iterator iterator = ads.iterator();
                while (iterator.hasNext()) {
                    Log.d("MyApplication", iterator.next().toString());
                }
                NativeAdDetails adDetails = (NativeAdDetails) ads.get(0);
                if (adDetails != null) {
                    TextView title = adViewNative.findViewById(R.id.ad_headline);
                    title.setText(adDetails.getTitle());
                    ImageView icon = adViewNative.findViewById(R.id.ad_app_icon);
                    Glide.with(activity).load(adDetails.getSecondaryImageUrl()).into(icon);
                    TextView description = adViewNative.findViewById(R.id.ad_body);
                    description.setText(adDetails.getDescription());
                    Button open = adViewNative.findViewById(R.id.ad_call_to_action);
                    open.setText(adDetails.isApp() ? "Install" : "Open");
                    adDetails.registerViewForInteraction(adViewNative);
                }
            }

            @Override
            public void onFailedToReceiveAd(@Nullable com.startapp.sdk.adsbase.Ad ad) {
                if (onLoadSmallNativesStartApp !=null){
                    onLoadSmallNativesStartApp.onFailedToReceiveAd("");
                }

            }

        };
        startAppNativeAd.loadAd(adListener);
        layNative.addView(adViewNative);
    }

    public static void MediumNativeStartApp(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
        startAppNativeAd = new StartAppNativeAd(activity);
        View adViewNative = (View) activity.getLayoutInflater()
                .inflate(R.layout.startapp_medium_native, null);
        AdEventListener adListener = new AdEventListener() {
            @Override
            public void onReceiveAd(@NonNull com.startapp.sdk.adsbase.Ad ad) {
                if (onLoadMediumNativesStartApp!=null){
                    onLoadMediumNativesStartApp.onReceiveAd();
                }
                ArrayList ads = startAppNativeAd.getNativeAds();    // get NativeAds list
                Iterator iterator = ads.iterator();
                while (iterator.hasNext()) {
                    Log.d("MyApplication", iterator.next().toString());
                }
                NativeAdDetails adDetails = (NativeAdDetails) ads.get(0);
                if (adDetails != null) {
                    TextView title = adViewNative.findViewById(R.id.ad_headline);
                    title.setText(adDetails.getTitle());
                    ImageView icon = adViewNative.findViewById(R.id.ad_app_icon);
                    Glide.with(activity).load(adDetails.getSecondaryImageUrl()).into(icon);
                    ImageView details = adViewNative.findViewById(R.id.imgDetail);
                    //Glide.with(activity).load(adDetails.getImageUrl()).centerCrop().fit().into(details);
                    Glide.with(activity).load(adDetails.getImageUrl()).into(details);
                    TextView description = adViewNative.findViewById(R.id.ad_body);
                    description.setText(adDetails.getDescription());
                    Button open = adViewNative.findViewById(R.id.ad_call_to_action);
                    open.setText(adDetails.isApp() ? "Install" : "Open");
                    adDetails.registerViewForInteraction(adViewNative);
                }
            }

            @Override
            public void onFailedToReceiveAd(@Nullable com.startapp.sdk.adsbase.Ad ad) {
                if (onLoadMediumNativesStartApp!=null){
                    onLoadMediumNativesStartApp.onFailedToReceiveAd("");
                }
            }

        };
        startAppNativeAd.loadAd(adListener);
        layNative.addView(adViewNative);
    }

    public static void MediumNativeAdmob(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup, String Hpk1,
                                         String Hpk2, String Hpk3, String Hpk4, String Hpk5) {

    }

    public static void MediumNativeMax(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }

    public static void MediumNativeFan(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {

    }


    public static void MediumNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

    public static void SmallNativeAlien(Activity activity, RelativeLayout layNative, String selectAdsBackup, String nativeId, String idNativeBackup) {
    }

}
