package com.goldilion.myapplication;

import static com.goldilion.myapplication.Setting.BackupBanner;
import static com.goldilion.myapplication.Setting.MainBanner;
import static com.goldilion.myapplication.Setting.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.goldilion.familymultiads.AndroAdsBanner;
import com.goldilion.familymultiads.AndroAdsMediumBanner;
import com.goldilion.familymultiads.interfaces.banner.OnLoadBannerAdmob;

public class BannerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);
        /*
        Load Relativelayout from activity_banner.xml
         */
        RelativeLayout laySmallAds = findViewById(R.id.lay320x50);
        RelativeLayout layMediumAds = findViewById(R.id.lay300x250);

        /*
        Small Banner 320x50
         */
//        AndroAdsBanner.SmallBannerApplovinMax(this, laySmallAds,Select_Backup_Ads,MainBanner,BackupBanner);
        AndroAdsBanner.onLoadBannerAdmob = new OnLoadBannerAdmob() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(BannerActivity.this,"Ads Loaded",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(String error) {
                Toast.makeText(BannerActivity.this,"Ads Failed",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdOpened() {

            }

            @Override
            public void onAdClicked() {

            }

            @Override
            public void onAdClosed() {

            }
        };

        /*
        Medium Banner 300x250
         */
//        AndroAdsMediumBanner.MediumBannerApplovinMax(this, layMediumAds,Select_Backup_Ads,MainBanner,BackupBanner);
        AndroAdsMediumBanner.onLoadBannerAdmob = new OnLoadBannerAdmob() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(String error) {

            }

            @Override
            public void onAdOpened() {

            }

            @Override
            public void onAdClicked() {

            }

            @Override
            public void onAdClosed() {

            }
        };

    }
}