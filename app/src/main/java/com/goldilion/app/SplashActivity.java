package com.goldilion.app;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.goldilion.familymultiads.AndroAdsOpenAds;
import com.goldilion.familymultiads.AndroAdsInitialize;
import com.goldilion.familymultiads.interfaces.open.OnLoadOpenAppAdmob;
import com.goldilion.familymultiads.interfaces.open.OnShowOpenAppAdmob;
import com.goldilion.sdkads.config.InitializeAlienAds;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        /*
        AndroAds have 2 ads (view and mediation)
        type view ads = Banner, Interstitial and Open Ads
        type mediation Ads = Banner, Interstitial, Rewards and Natives
         */
        /*
        Initilize for Alien Mediation Ads
         */
        InitializeAlienAds.LoadSDK();
        AndroAdsInitialize.SelectAdsApplovinMax(this, Settings.Select_Backup_Ads, Settings.Backup_Initialize);
        if (Settings.Select_Open_Ads.equals("1")){
            AndroAdsOpenAds.LoadOpenAds("ca-app-pub-3940256099942544/3419835294",true);
            AndroAdsOpenAds.onLoadOpenAppAdmob = new OnLoadOpenAppAdmob() {
                @Override
                public void onAdLoaded() {
                    AndroAdsOpenAds.onShowOpenAppAdmob = new OnShowOpenAppAdmob() {
                        @Override
                        public void onAdDismissedFullScreenContent() {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            finish();
                        }

                        @Override
                        public void onAdFailedToShowFullScreenContent() {

                        }

                        @Override
                        public void onAdShowedFullScreenContent() {

                        }
                    };
                }

                @Override
                public void onAdFailedToLoad() {
                    startActivity(true);
                }
            };
        } else {
            startActivity(true);
        }


    }

    private void startActivity(boolean useTime){
        if (useTime){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            finish();
                }
            },1000*3);
        }else {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

    }


}
