package com.aliendroid.alienads;

import android.app.Activity;
import android.provider.Settings;

import androidx.annotation.Nullable;

import com.startapp.sdk.adsbase.StartAppSDK;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AlienGDPR {


    public static void loadGdpr(Activity activity, String selectAds, boolean childDirected) {
                StartAppSDK.setUserConsent(activity,
                        "pas",
                        System.currentTimeMillis(),
                        true);
    }

}
