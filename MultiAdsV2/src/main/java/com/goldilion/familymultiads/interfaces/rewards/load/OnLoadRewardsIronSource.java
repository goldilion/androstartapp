package com.goldilion.familymultiads.interfaces.rewards.load;

public interface OnLoadRewardsIronSource {
    void onRewardedVideoAdOpened();
    void onRewardedVideoAdClosed();
    void onRewardedVideoAvailabilityChanged();
    void onRewardedVideoAdRewarded();
    void onRewardedVideoAdShowFailed();
    void onRewardedVideoAdClicked();
    void onRewardedVideoAdStarted();
    void onRewardedVideoAdEnded();
}
