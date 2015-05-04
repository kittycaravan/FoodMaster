package com.wizardlyshop.foodmaster;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class TabHostActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabhost);

        TabHost tabHost = getTabHost();
        TabSpec tabSpec = tabHost.newTabSpec("tab1");
        Intent intent = new Intent(TabHostActivity.this, SelectActivity.class);
        tabSpec.setIndicator("Select").setContent(intent);
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tab2");
        intent = new Intent(TabHostActivity.this, FavoritesActivity.class);
        tabSpec.setIndicator("Favorites").setContent(intent);
        tabHost.addTab(tabSpec);
    }
}
