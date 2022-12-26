package com.goldilion.startapp;

import static com.goldilion.startapp.Settings.BackupBanner;
import static com.goldilion.startapp.Settings.MainBanner;
import static com.goldilion.startapp.Settings.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.aliendroid.alienads.AliendroidBanner;
import com.aliendroid.alienads.AliendroidMediumBanner;
import com.aliendroid.alienads.interfaces.banner.OnLoadBannerAdmob;

public class BannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        /*
        Load Relativelayout from acitivty_banner.xml
         */
        RelativeLayout laySmallAds = findViewById(R.id.lay320x50);
        RelativeLayout layMediumAds = findViewById(R.id.lay300x250);

        /*
        Small Banner 320x50
         */
        AliendroidBanner.SmallBannerStartApp(this, laySmallAds,Select_Backup_Ads,MainBanner,BackupBanner);


        /*
        Medium Banner 300x250
         */
        AliendroidMediumBanner.MediumBannerStartApp(this, layMediumAds,Select_Backup_Ads,MainBanner,BackupBanner);


    }
}