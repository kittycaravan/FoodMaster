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
        Button btn = findViewById(R.id.buttonStart);
        btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent;
				intent=new Intent(getApplicationContext(), ActivityTabHost.class);
				startActivity(intent);
				finish();
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

	@Override
	protected void onDestroy() {
    	killMediaPlayer();
		super.onDestroy();
	}
}