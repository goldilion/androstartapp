package com.goldilion.familymultiads.interfaces.rewards.load;

public interface OnLoadRewardsAlienMediation {
    void onRewardsAdLoaded();
    void onRewardsAdClosed();
    void onRewardsAdReward();
    void onRewardsAdClicked();
    void onRewardsAdFailedToLoad(String error);
}
