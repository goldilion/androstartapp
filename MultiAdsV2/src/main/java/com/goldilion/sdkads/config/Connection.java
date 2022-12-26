package com.goldilion.sdkads.config;

import android.app.Application;

import com.smaato.sdk.core.Config;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.log.LogLevel;

public class Connection {
    public static void SDKMediation(Application app, String Appkey){
        try {
            Config config = Config.builder()
                    .setLogLevel(LogLevel.ERROR)
                    .setHttpsOnly(true)
                    .build();
            SmaatoSdk.init(app,config, Appkey);
            SmaatoSdk.setGPSEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
