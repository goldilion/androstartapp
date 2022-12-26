package com.goldilion.myapplication;

import static com.goldilion.myapplication.Setting.BackupIntertitial;
import static com.goldilion.myapplication.Setting.BackupReward;
import static com.goldilion.myapplication.Setting.Backup_Initialize;
import static com.goldilion.myapplication.Setting.MainIntertitial;
import static com.goldilion.myapplication.Setting.MainRewards;
import static com.goldilion.myapplication.Setting.Select_Backup_Ads;
import static com.goldilion.myapplication.Setting.Select_Main_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.goldilion.familymultiads.AndroAdsGDPR;
import com.goldilion.familymultiads.AndroAdsInitialize;
import com.goldilion.familymultiads.AndroAdsIntertitial;
import com.goldilion.familymultiads.AndroAdsReward;
import com.goldilion.familymultiads.interfaces.interstitial.admob.OnFullScreenContentCallbackAdmob;
import com.goldilion.familymultiads.interfaces.interstitial.show.OnShowInterstitialAdmob;
import com.goldilion.familymultiads.interfaces.rewards.load.OnLoadRewardsAdmob;
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
        if (Setting.Select_Open_Ads.equals("2")) {

            AlienViewAds.OpenApp(MainActivity.this,AppIDViewAds);
        }
         */
//        AndroAdsInitialize.SelectAdsApplovinMax(this,Select_Backup_Ads,Backup_Initialize);
        AndroAdsGDPR.loadGdpr(this,Select_Main_Ads,true);
//        AndroAdsIntertitial.LoadIntertitialApplovinMax(MainActivity.this,Select_Backup_Ads,MainIntertitial,BackupIntertitial);

        AndroAdsIntertitial.onShowInterstitialAdmob = new OnShowInterstitialAdmob() {
            @Override
            public void onAdSuccess() {
                AndroAdsIntertitial.onFullScreenContentCallbackAdmob = new OnFullScreenContentCallbackAdmob() {
                    @Override
                    public void onAdClicked() {

                    }

                    @Override
                    public void onAdDismissedFullScreenContent() {
                        Intent open = new Intent(MainActivity.this,BannerActivity.class);
                        startActivity(open);
                    }

                    @Override
                    public void onAdImpression() {

                    }

                    @Override
                    public void onAdShowedFullScreenContent() {

                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent() {

                    }
                };
            }

            @Override
            public void onAdFailedShow() {
                Intent open = new Intent(MainActivity.this,BannerActivity.class);
                startActivity(open);
            }
        };

//        AndroAdsReward.LoadRewardApplovinMax(this,Select_Backup_Ads,MainRewards,BackupReward);
        AndroAdsReward.onLoadRewardsAdmob = new OnLoadRewardsAdmob() {
            @Override
            public void onAdFailedToLoad() {

            }

            @Override
            public void onAdLoaded(String error) {

            }
        };

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
//        AndroAdsIntertitial.ShowIntertitialAdmob(MainActivity.this,Select_Backup_Ads,MainIntertitial,BackupIntertitial,0,"",
//        "","","","");
    }

//    public void REWARD(View view){
//        AndroAdsReward.ShowRewardAdmob(MainActivity.this,Select_Backup_Ads,MainRewards,BackupReward);
//    }

    public void onBackPressed(){
        finishAffinity();
        System.exit(0);
    }
}