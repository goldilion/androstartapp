package com.goldilion.myapplication;

import static com.goldilion.myapplication.Setting.AppIDViewAds;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.goldilion.sdkads.config.AppPromote;
import com.goldilion.sdkads.interfaces.OnOpenViewAdListener;
import com.goldilion.sdkads.interfaces.OnShowRewardsView;
import com.goldilion.sdkads.type.view.AlienViewAds;

public class ViewAdsActivity extends AppCompatActivity {
      /*
      Implementation for Alien View Ads
       */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ads);
        AppPromote.initializeAppPromote(this);
        AlienViewAds.Banner(ViewAdsActivity.this,findViewById(R.id.layAdsView),AppIDViewAds);
        AlienViewAds.Interstitial(this,AppIDViewAds);
        AlienViewAds.RewardsAds(this,AppIDViewAds);

    }

    public void OPENADS(View view){
        AlienViewAds.OpenApp(ViewAdsActivity.this,AppIDViewAds);
        AlienViewAds.onOpenViewAdListener = new OnOpenViewAdListener() {
            @Override
            public void onInterstitialAdLoaded() {

            }

            @Override
            public void onInterstitialAdClosed() {

            }

            @Override
            public void onInterstitialAdClicked() {

            }

            @Override
            public void onInterstitialAdFailedToLoad(String error) {

            }
        };

    }

    public void INTERSTITIAL(View view){
        AlienViewAds.ShowIntertitial();

    }

    public void REWARDS(View view){
        AlienViewAds.ShowRewards();
        AlienViewAds.onShowRewardsView = new OnShowRewardsView() {
            @Override
            public void onAdSuccess() {

            }

            @Override
            public void onAdFailedShow() {

            }
        };

    }
}