package com.goldilion.startapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.aliendroid.alienads.AliendroidIntertitial;
import com.aliendroid.alienads.AliendroidReward;
import com.aliendroid.alienads.interfaces.interstitial.show.OnShowInterstitialAdmob;
import com.aliendroid.sdkads.config.AppPromote;
import com.aliendroid.sdkads.config.InitializeAlienAds;
import com.aliendroid.sdkads.type.mediation.AlienMediationAds;

public class MediationAdsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediation_ads);

        AlienMediationAds.SmallBanner(this,findViewById(R.id.layAdsView),Settings.BackupBanner);
        AlienMediationAds.LoadInterstitial(this,Settings.BackupIntertitial);
        AlienMediationAds.LoadRewarded(Settings.BackupReward);
        AlienMediationAds.MediumNatives(this,findViewById(R.id.layAlienNatives),Settings.BackupNatives);
    }

    public void INTERSTITIAL(View view){
      AlienMediationAds.ShowInterstitial(MediationAdsActivity.this);

    }

    public void REWARD(View view){
      AlienMediationAds.ShowReward();
    }
}