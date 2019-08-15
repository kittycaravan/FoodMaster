package com.wizardlyshop.foodmaster;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.wizardlyshop.foodmaster.util.UtilVersionInfo;
public class ActivitySplash extends AppCompatActivity {
	private static final int DELAY_MILLI_SEC = 3000;
	private MediaPlayer mMediaPlayer;
	private ImageView mImgCat;
	private int mTouchCountForShowVersion = 0;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
		////	이스터에그 - 버전 확인용	////
        mImgCat = findViewById(R.id.splash_img_cat);
        mImgCat.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				mTouchCountForShowVersion ++;
				if(mTouchCountForShowVersion == 5) {
					easterEggShowVersion();
				}
			}
		});
		////	이스터에그 - 버전 확인용	////
        playIntroVoice();
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() { //여기에 딜레이 후 시작할 작업들을 입력
				Intent intent;
				intent=new Intent(getApplicationContext(), ActivityTabHost.class);
				startActivity(intent);
				finish();
			}
		}, DELAY_MILLI_SEC); // n (ms)초 정도 딜레이를 준 후 시작
    }
    private void playIntroVoice(){
		killMediaPlayer();
		mMediaPlayer = new MediaPlayer();
		mMediaPlayer = MediaPlayer.create(this, R.raw.today);
		try {
			mMediaPlayer.prepare();
		} catch (Exception e){}
		mMediaPlayer.start();
	}
	private void killMediaPlayer() {
		if(mMediaPlayer != null){
			try{
				mMediaPlayer.release();
			} catch (Exception e) { }
		}
	}
	@Override
	protected void onDestroy() {
    	killMediaPlayer();
		super.onDestroy();
	}
	/** 이스터에그 - 버전 확인용 */
	private void easterEggShowVersion(){
		Toast.makeText(this, "code :" + UtilVersionInfo.getAppVersionCode(this)
				+ " version: " + UtilVersionInfo.getAppVersionName(this), Toast.LENGTH_SHORT).show();
	}
}