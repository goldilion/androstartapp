package com.goldilion.startapp;

import static com.goldilion.startapp.Settings.BackupNatives;
import static com.goldilion.startapp.Settings.MainNatives;
import static com.goldilion.startapp.Settings.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidNative;
import com.aliendroid.alienads.interfaces.natives.OnLoadMediumNativesAdmob;

public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);

        RelativeLayout laySmallAds = findViewById(R.id.laySmallNatives);
        AliendroidNative.SmallNativeStartApp(this, laySmallAds,Select_Backup_Ads,MainNatives,BackupNatives);

        RelativeLayout layMediumAds = findViewById(R.id.layMediumNatives);
        AliendroidNative.MediumNativeStartApp(this, layMediumAds,Select_Backup_Ads,MainNatives,BackupNatives);

    }
}