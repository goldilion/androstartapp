package com.goldilion.familymultiads.interfaces.rewards.load;

public interface OnLoadRewardsApplovinDiscovery {
    void adReceived();
    void failedToReceiveAd(String error);

}
