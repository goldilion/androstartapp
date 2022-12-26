package com.goldilion.app;

import static com.goldilion.app.Settings.BackupBanner;
import static com.goldilion.app.Settings.MainBanner;
import static com.goldilion.app.Settings.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.goldilion.startapp.AndroAdsBanner;
import com.goldilion.startapp.AndroAdsMediumBanner;
import com.goldilion.app.R;

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
        AndroAdsBanner.SmallBannerStartApp(this, laySmallAds,Select_Backup_Ads,MainBanner,BackupBanner);


        /*
        Medium Banner 300x250
         */
        AndroAdsMediumBanner.MediumBannerStartApp(this, layMediumAds,Select_Backup_Ads,MainBanner,BackupBanner);


    }
}