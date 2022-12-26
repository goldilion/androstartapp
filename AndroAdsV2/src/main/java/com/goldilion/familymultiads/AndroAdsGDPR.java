package com.goldilion.familymultiads;

import android.app.Activity;

import com.startapp.sdk.adsbase.StartAppSDK;

public class AndroAdsGDPR {


    public static void loadGdpr(Activity activity, String selectAds, boolean childDirected) {
                StartAppSDK.setUserConsent(activity,
                        "pas",
                        System.currentTimeMillis(),
                        true);
    }

}
