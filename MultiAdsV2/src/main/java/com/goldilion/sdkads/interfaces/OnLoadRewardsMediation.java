package com.goldilion.sdkads.interfaces;

public interface OnLoadRewardsMediation {
    void onRewardsAdLoaded();
    void onRewardsAdClosed();
    void onRewardsAdReward();
    void onRewardsAdClicked();
    void onRewardsAdFailedToLoad(String error);
}
