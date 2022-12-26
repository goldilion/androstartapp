package com.goldilion.myapplication;

import static com.goldilion.myapplication.Setting.BackupNatives;
import static com.goldilion.myapplication.Setting.MainNatives;
import static com.goldilion.myapplication.Setting.Select_Backup_Ads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.goldilion.familymultiads.AndroAdsNative;
import com.goldilion.familymultiads.interfaces.natives.OnLoadMediumNativesAdmob;

public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);

        RelativeLayout laySmallAds = findViewById(R.id.laySmallNatives);
//        AndroAdsNative.SmallNativeAdmobRectangle(this, laySmallAds,Select_Backup_Ads,MainNatives,BackupNatives,"",
//                "","","","");

        RelativeLayout layMediumAds = findViewById(R.id.layMediumNatives);

        AndroAdsNative.onLoadMediumNativesAdmob = new OnLoadMediumNativesAdmob() {
            @Override
            public void onNativeAdLoaded() {
                Toast.makeText(NativeActivity.this,"Iklan Terload",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(String error) {
                Toast.makeText(NativeActivity.this,"Iklan Gagal Terload",
                        Toast.LENGTH_SHORT).show();
            }
        };

    }
}