package com.goldilion.app;

import static com.goldilion.app.Settings.BackupIntertitial;
import static com.goldilion.app.Settings.BackupReward;
import static com.goldilion.app.Settings.Backup_Initialize;
import static com.goldilion.app.Settings.MainIntertitial;
import static com.goldilion.app.Settings.MainRewards;
import static com.goldilion.app.Settings.Select_Backup_Ads;
import static com.goldilion.app.Settings.Select_Main_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.goldilion.familymultiads.AndroAdsGDPR;
import com.goldilion.familymultiads.AndroAdsInitialize;
import com.goldilion.familymultiads.AndroAdsIntertitial;
import com.goldilion.familymultiads.AndroAdsReward;
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