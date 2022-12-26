package com.goldilion.app;

import static com.goldilion.app.Settings.BackupNatives;
import static com.goldilion.app.Settings.MainNatives;
import static com.goldilion.app.Settings.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.goldilion.familymultiads.AndroAdsNative;

public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);

        RelativeLayout laySmallAds = findViewById(R.id.laySmallNatives);
        AndroAdsNative.SmallNativeStartApp(this, laySmallAds,Select_Backup_Ads,MainNatives,BackupNatives);

        RelativeLayout layMediumAds = findViewById(R.id.layMediumNatives);
        AndroAdsNative.MediumNativeStartApp(this, layMediumAds,Select_Backup_Ads,MainNatives,BackupNatives);

    }
}