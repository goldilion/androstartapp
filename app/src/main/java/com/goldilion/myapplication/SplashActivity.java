package com.goldilion.myapplication;

import static com.goldilion.myapplication.Setting.Backup_Initialize;
import static com.goldilion.myapplication.Setting.ONLOADOPEN;
import static com.goldilion.myapplication.Setting.Select_Backup_Ads;

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
        Aliendroid have 2 ads (view and mediation)
        type view ads = Banner, Interstitial and Open Ads
        type mediation Ads = Banner, Interstitial, Rewards and Natives
         */
        /*
        Initilize for Alien Mediation Ads
         */
        InitializeAlienAds.LoadSDK();
//        AndroAdsInitialize.SelectAdsApplovinMax(this,Select_Backup_Ads,Backup_Initialize);
        if (Setting.Select_Open_Ads.equals("1")){
//            AndroAdsOpenAds.LoadOpenAds("ca-app-pub-3940256099942544/3419835294",ONLOADOPEN);
//            AndroAdsOpenAds.AppOpenAdManager.showAdIfAvailable(SplashActivity.this, new AndroAdsOpenAds.OnShowAdCompleteListener() {
//                @Override
//                public void onShowAdComplete() {
//                    startActivity(true);
//                }
//            });

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
