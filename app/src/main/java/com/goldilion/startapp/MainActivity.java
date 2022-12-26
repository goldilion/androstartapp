package com.goldilion.startapp;

import static com.goldilion.startapp.Settings.BackupIntertitial;
import static com.goldilion.startapp.Settings.BackupReward;
import static com.goldilion.startapp.Settings.Backup_Initialize;
import static com.goldilion.startapp.Settings.MainIntertitial;
import static com.goldilion.startapp.Settings.MainRewards;
import static com.goldilion.startapp.Settings.Select_Backup_Ads;
import static com.goldilion.startapp.Settings.Select_Main_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.goldilion.startapp.AndroAdsGDPR;
import com.goldilion.startapp.AndroAdsInitialize;
import com.goldilion.startapp.AndroAdsIntertitial;
import com.goldilion.startapp.AndroAdsReward;
import com.goldilion.startapp.interfaces.interstitial.admob.OnFullScreenContentCallbackAdmob;
import com.goldilion.startapp.interfaces.interstitial.load.OnLoadInterstitialAdmob;
import com.goldilion.startapp.interfaces.interstitial.show.OnShowInterstitialAdmob;
import com.goldilion.startapp.interfaces.rewards.load.OnLoadRewardsAdmob;
import com.goldilion.sdkads.config.AppPromote;
import com.goldilion.sdkads.config.InitializeAlienAds;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppPromote.initializeAppPromote(this);
        InitializeAlienAds.LoadSDK();
        /*
        if (Settings.Select_Open_Ads.equals("2")) {

            AlienViewAds.OpenApp(MainActivity.this,AppIDViewAds);
        }
         */
        AndroAdsInitialize.SelectAdsStartApp(this,Select_Backup_Ads,"1234567890",Backup_Initialize);
        AndroAdsGDPR.loadGdpr(this,Select_Main_Ads,true);
        AndroAdsIntertitial.LoadIntertitialStartApp(MainActivity.this,Select_Backup_Ads,MainIntertitial,BackupIntertitial);

        AndroAdsReward.LoadRewardStartApp(this,Select_Backup_Ads,MainRewards,BackupReward);


    }

    public void BANNER(View view){
        Intent open = new Intent(MainActivity.this,BannerActivity.class);
        startActivity(open);

    }

    public void VIEWADS(View view){
        Intent open = new Intent(MainActivity.this,ViewAdsActivity.class);
        startActivity(open);

    }

    public void NATIVES(View view){
        Intent open = new Intent(MainActivity.this,NativeActivity.class);
        startActivity(open);

    }


    public void MEDIATION(View view){
        Intent open = new Intent(MainActivity.this,MediationAdsActivity.class);
        startActivity(open);

    }

    public void INTERSTITIAL(View view){
        AndroAdsIntertitial.ShowIntertitialSartApp(MainActivity.this,Select_Backup_Ads,MainIntertitial,BackupIntertitial,0);
    }

    public void REWARD(View view){
        AndroAdsReward.ShowRewardStartApp(MainActivity.this,Select_Backup_Ads,MainRewards,BackupReward);
    }

    public void onBackPressed(){
        finishAffinity();
        System.exit(0);
    }
}