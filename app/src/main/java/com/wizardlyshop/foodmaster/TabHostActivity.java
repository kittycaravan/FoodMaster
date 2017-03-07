package com.wizardlyshop.foodmaster;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class TabHostActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tabhost);

		////	광고 배너	////
		AdView mAdView = (AdView) findViewById(R.id.adView);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView.loadAd(adRequest);
		////	광고 배너	////
		
		TabHost tabHost=getTabHost();
		TabSpec tabSpec=tabHost.newTabSpec("tab1");
		Intent intent=new Intent(TabHostActivity.this, SelectActivity.class);
		tabSpec.setIndicator("Select").setContent(intent);
		tabHost.addTab(tabSpec);
		
		tabSpec=tabHost.newTabSpec("tab2");
		intent=new Intent(TabHostActivity.this, FavoritesActivity.class);
		tabSpec.setIndicator("Favorites").setContent(intent);
		tabHost.addTab(tabSpec);

		tabSpec=tabHost.newTabSpec("tab3");
		intent=new Intent(TabHostActivity.this, TestActivity.class);
		tabSpec.setIndicator("Test").setContent(intent);
		tabHost.addTab(tabSpec);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
