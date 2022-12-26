package com.goldilion.familymultiads.interfaces.rewards.load;

public interface OnLoadRewardsGoogle {
    void onAdFailedToLoad();
    void onAdLoaded(String error);

}
