package com.wizardlyshop.foodmaster;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class ActivitySplash extends AppCompatActivity {
	private MediaPlayer mMediaPlayer;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        playIntroVoice();
        loadGlobalSound();
        Button btn = findViewById(R.id.buttonStart);
        btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				FoodMasterGlobals.gPlaySoundButtonClick();	//사운드 출력 : 버튼 효과음
				Intent intent;
				intent=new Intent(getApplicationContext(), ActivityTabHost.class);
				startActivity(intent);
			}
		});
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

    private void killMediaPlayer(){
		if(mMediaPlayer != null){
			try{
				mMediaPlayer.release();
			} catch (Exception e) { }
		}
	}

    public void loadGlobalSound(){
		////글로벌 음성 로딩 처리
        FoodMasterGlobals.gSoundpool=new SoundPool(
        		1,	//최대 넣을 음악파일의 갯수
        		AudioManager.STREAM_MUSIC,	//stream 타입
        		0);	//음질, 기본값:0
        FoodMasterGlobals.gSoundID[0]=FoodMasterGlobals.gSoundpool.load(
        		ActivitySplash.this,	//현재화면의 context
        		R.raw.button6,			//재생할 음악
        		1);	//재생 우선순위
    }

	@Override
	protected void onDestroy() {
    	killMediaPlayer();
		super.onDestroy();
	}
}