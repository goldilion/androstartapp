package com.goldilion.sdkads.config;

import android.app.Activity;

import com.goldilion.sdkads.connections.ConnectionPromote;
import com.goldilion.sdkads.interfaces.OnConnectedListener;
import com.goldilion.sdkads.interfaces.OnPromoteAppListener;

public class AppPromote {
    public static OnPromoteAppListener onPromoteAppListener;
    public static void initializeAppPromote(Activity activity){
            ConnectionPromote connectionPromote = new ConnectionPromote(activity,"https://ad.clickmobile.id/v1/ad/list/json");
            connectionPromote.setOnPromoteConnected(new OnConnectedListener() {
                @Override
                public void onAppConnected() {
                    if (onPromoteAppListener != null){
                        onPromoteAppListener.onInitializeSuccessful();
                    }
                }

                @Override
                public void onAppFailed(String error) {
                    if (onPromoteAppListener != null){
                        onPromoteAppListener.onInitializeFailed(error);
                    }
                }
            });

    }
}
