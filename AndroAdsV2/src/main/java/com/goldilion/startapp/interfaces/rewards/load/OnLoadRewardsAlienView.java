package com.goldilion.startapp.interfaces.rewards.load;

public interface OnLoadRewardsAlienView {
    void onRewardsAdLoaded();
    void onRewardsAdClosed();
    void onRewardsAdReward();
    void onRewardsAdClicked();
    void onRewardsAdFailedToLoad(String error);
}
