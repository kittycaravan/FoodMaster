package com.wizardlyshop.foodmaster;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
public class TabHostActivity extends TabActivity {
    //ad mob 광고 추가
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost);

        //ad mob 광고 추가
        MobileAds.initialize(this,getString(R.string.admob_app_id));
        mAdView = findViewById(R.id.ad_view);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener(){
            @Override
            public void onAdLoaded() {
                Log.v("hoyangi","==== 광고 - 문제없으면 이거 출력");
            }
            @Override
            public void onAdFailedToLoad(int i) {
                Log.v("hoyangi","==== 광고 - 문제있으면 이거 출력");
            }
        });


        TabHost tabHost = getTabHost();
        TabSpec tabSpec = tabHost.newTabSpec("tab1");
        Intent intent = new Intent(TabHostActivity.this, SelectActivity.class);
        tabSpec.setIndicator(getString(R.string.activity_main_tab_1_select)).setContent(intent);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tab2");
        intent = new Intent(TabHostActivity.this, FavoritesActivity.class);
        tabSpec.setIndicator(getString(R.string.activity_main_tab_2_favorites)).setContent(intent);
        tabHost.addTab(tabSpec);
    }
}
